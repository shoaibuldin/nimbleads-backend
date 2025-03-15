package com.nimbleads.controller

import com.nimbleads.payload.auth.AuthenticationRequest
import com.nimbleads.payload.auth.AuthenticationResponse
import com.nimbleads.service.auth.AuthenticationService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val authenticationService: AuthenticationService
) {

    @PostMapping
    fun authenticate(
        @RequestBody authRequest: AuthenticationRequest
    ): AuthenticationResponse = authenticationService.authentication(authRequest)

}