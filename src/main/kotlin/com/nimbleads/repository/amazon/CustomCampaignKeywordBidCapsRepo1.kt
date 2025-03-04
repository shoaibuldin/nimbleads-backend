package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.CustomCampaignsKeywordBidCaps
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CustomCampaignKeywordBidCapsRepo : JpaRepository<CustomCampaignsKeywordBidCaps?, Long?> {
    fun findByCustomerIdAndCampaignIdAndCapSourceAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        date: Date?
    ): List<CustomCampaignsKeywordBidCaps?>?

    fun findByCustomerIdAndCampaignIdAndCapSourceAndKeywordTextAndMatchTypeId(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        keyword: String?,
        matchType: Int?
    ): CustomCampaignsKeywordBidCaps?
}
