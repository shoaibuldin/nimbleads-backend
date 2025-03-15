package com.nimbleads.payload.auth

data class AuthenticationResponse(
    val accessToken: String,
    val refreshToken: String,
)