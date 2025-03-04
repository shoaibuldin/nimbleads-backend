package com.nimbleads.repository.instacart

import com.nimbleads.model.instacart.InstaCartRefreshTokens
import org.springframework.data.jpa.repository.JpaRepository

interface InstaCartRefreshTokensRepo : JpaRepository<InstaCartRefreshTokens?, Long?> {
    fun findByNaCustomerId(customerId: Long?): InstaCartRefreshTokens?

    fun findByInstaCartState(state: String?): InstaCartRefreshTokens?
}
