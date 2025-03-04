package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AsinKeywordBidCaps
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AsinKeywordBidCapsRepo : JpaRepository<AsinKeywordBidCaps?, Long?> {
    fun findByCustomerIdAndAndAsinAndCapSourceAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        asin: String?,
        capSource: Long?,
        expirationTime: Date?
    ): List<AsinKeywordBidCaps?>?

    fun findByCustomerIdAndAndAsinAndCapSourceAndKeywordTextAndMatchTypeId(
        customerId: Long?,
        asin: String?,
        capSource: Long?,
        keyword: String?,
        matchType: Long?
    ): AsinKeywordBidCaps?

    fun findByCustomerIdAndAsinAndKeywordText(
        customerId: Long?,
        asin: String?,
        keywordText: String?
    ): List<AsinKeywordBidCaps?>?
}
