package com.nimbleads.payload.auth

data class AuthenticationRequest(
    val email: String,
    val password: String,
)