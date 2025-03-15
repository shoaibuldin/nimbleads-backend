package com.nimbleads.service.auth

import com.nimbleads.payload.auth.AuthenticationRequest
import com.nimbleads.payload.auth.AuthenticationResponse
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class AuthenticationService(
    private val jwtService: JwtService,
    private val userDetailsService: CustomUserDetailsService

    ) {
    fun authentication(authRequest: AuthenticationRequest): AuthenticationResponse {

        val user = userDetailsService.loadUserByUsername(authRequest.email)

        val jwt = jwtService.generate(user.username)

        return AuthenticationResponse(
            accessToken = jwt,
            refreshToken = jwt
        )
    }

}