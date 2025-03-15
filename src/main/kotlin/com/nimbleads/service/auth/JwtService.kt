package com.nimbleads.service.auth

import com.nimbleads.config.auth.JwtProperties
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.stereotype.Service
import java.util.*


@Service
class JwtService(
    val jwtProperties: JwtProperties
) {

//    fun generate(
//        email: String,
//        additionalClaims: Map<String, Any> = emptyMap()
//    ): String =
//        Jwts.builder()
//            .claims()
//            .subject(email)
//            .issuedAt(Date(System.currentTimeMillis()))
//            .expiration(Date(System.currentTimeMillis() + jwtProperties.accessTokenExpiration))
//            .add(additionalClaims)
//            .and()
//            .signWith(SignatureAlgorithm.HS256 , jwtProperties.key)
//            .compact()

    // Initializes the key after the class is instantiated and the jwtSecret is injected,
    // preventing the repeated creation of the key and enhancing performance
    fun generate(username: String?): String {
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(Date())
            .setExpiration(Date(Date().time + jwtProperties.accessTokenExpiration))
            .signWith(SignatureAlgorithm.HS256, secretKey)
            .compact()
    }

    fun extractEmail(token: String): String? =
        getAllClaims(token)
            .subject


    fun isValid(token: String, requestedEmail: String): Boolean {
        val email = extractEmail(token)

        return requestedEmail == email && !isExpired(token)
    }

    fun isExpired(token: String): Boolean =
        getAllClaims(token)
            .expiration
            .before(Date(System.currentTimeMillis()))

    private fun getAllClaims(token: String): Claims {
        val parser = Jwts.parser()
            .setSigningKey(secretKey)
            .build()

        return parser
            .parseClaimsJws(token)

//            .parseSignedClaims(token)
            .body
    }

    private val secretKey =
        jwtProperties.key

}
