package com.nimbleads.model.config

import java.io.Serializable

data class AgencyUsersKey(
    val agencyId: Long? = null,
    val userId: Long? = null,
) : Serializable {}
