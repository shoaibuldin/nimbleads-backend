package com.nimbleads.repository.instacart

import com.nimbleads.model.instacart.InstacartCustomCampaignsKeywordBidCaps
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface InstacartCustomCampaignKeywordBidCapsRepo : JpaRepository<InstacartCustomCampaignsKeywordBidCaps?, Long?> {
    fun findByCustomerIdAndCampaignIdAndCapSourceAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        date: Date?
    ): List<InstacartCustomCampaignsKeywordBidCaps?>?

    fun findByCustomerIdAndCampaignIdAndKeywordText(
        customerId: Long?,
        campaignId: Long?,
        keyword: String?
    ): InstacartCustomCampaignsKeywordBidCaps?

    fun findByCustomerIdAndCampaignIdAndCapSourceAndKeywordTextAndMatchTypeId(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        keyword: String?,
        matchType: Int?
    ): InstacartCustomCampaignsKeywordBidCaps?

    fun findByCustomerIdAndCampaignIdAndKeywordTextAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        databaseCampaignId: Long?,
        keywords: String?,
        date: Date?
    ): InstacartCustomCampaignsKeywordBidCaps?
}
