package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.CustomCampaignAsinTargetAsinBidCaps
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CustomCampaignAsinTargetBidCapsRepo : JpaRepository<CustomCampaignAsinTargetAsinBidCaps?, Long?> {
    fun findByCustomerIdAndCampaignIdAndCapSourceAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        campaignId: Long?,
        capSource: Long?,
        expirationTime: Date?
    ): List<CustomCampaignAsinTargetAsinBidCaps?>?

    fun findByCustomerIdAndCampaignIdAndCapSourceAndTargetId(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        targetId: Long?
    ): CustomCampaignAsinTargetAsinBidCaps?

    fun findByCustomerIdAndCampaignIdAndTargetId(
        customerId: Long?,
        campaignId: Long?,
        targetAsin: Long?
    ): List<CustomCampaignAsinTargetAsinBidCaps?>?
}
