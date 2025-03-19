package com.nimbleads.service.auth

import com.nimbleads.model.users.User
import com.nimbleads.payload.auth.AuthenticationRequest
import com.nimbleads.payload.auth.AuthenticationResponse
import com.nimbleads.repository.users.UserRepository
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private

@Service
class AuthenticationService(
    private val jwtService: JwtService,
    private val userDetailsService: CustomUserDetailsService,
    private val userRepository: UserRepository
) {

    fun getLoggedInUser(): User? {
        return if (SecurityContextHolder.getContext().authentication != null) userRepository.findByEmail(
            SecurityContextHolder.getContext().authentication.name
        )
        else null
    }

    fun isAgency(user: User): Boolean {
        return getPrivileges(user.roles, null).stream().anyMatch { x -> x.contains ("agency") }
    }

    fun isAdmin(user: User): Boolean {
        return getPrivileges(user.roles, null).stream().anyMatch { x -> x.contains("admin") }
    }

    fun isCustomer(user: User): Boolean {
        return getPrivileges(user.roles, null)
            .stream().anyMatch { x ->
                (x.contains("user")
                        || x.contains("self-serve"))
            }
    }

    fun authentication(authRequest: AuthenticationRequest): AuthenticationResponse {

        val user = userDetailsService.loadUserByUsername(authRequest.email)

        val jwt = jwtService.generate(user.username)

        return AuthenticationResponse(
            accessToken = jwt,
            refreshToken = jwt
        )
    }

}