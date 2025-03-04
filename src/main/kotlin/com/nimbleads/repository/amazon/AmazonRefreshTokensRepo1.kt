package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AmazonRefreshTokens
import org.springframework.data.jpa.repository.JpaRepository

interface AmazonRefreshTokensRepo : JpaRepository<AmazonRefreshTokens?, Long?> {
    fun findByNaCustomerId(customerId: Long?): AmazonRefreshTokens?

    fun findByAmazonState(state: String?): AmazonRefreshTokens?
}
