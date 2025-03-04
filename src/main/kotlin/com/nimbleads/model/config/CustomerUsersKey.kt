package com.nimbleads.model.config

import java.io.Serializable

data class CustomerUsersKey  (
    val customerId: Long? = null,
    val userId: Long? = null,
) : Serializable {}
