package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AsinTargetAsinBidCaps
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AsinTargetBidCapsRepo : JpaRepository<AsinTargetAsinBidCaps?, Long?> {
    fun findByCustomerIdAndAsinAndCapSourceAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        asin: String?,
        capSource: Long?,
        expirationTime: Date?
    ): List<AsinTargetAsinBidCaps?>?

    fun findByCustomerIdAndAndAsinAndCapSourceAndTargetAsin(
        customerId: Long?,
        asin: String?,
        l: Long,
        targetAsin: String?
    ): AsinTargetAsinBidCaps?

    fun findByCustomerIdAndAsinAndTargetAsin(
        customerId: Long?,
        asin: String?,
        targetAsin: String?
    ): List<AsinTargetAsinBidCaps?>?
}
