package com.nimbleads.repository.walmart

import com.nimbleads.model.walmart.WalmartCustomCampaignsKeywordBidCaps
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface WalmartCustomCampaignKeywordBidCapsRepo : JpaRepository<WalmartCustomCampaignsKeywordBidCaps?, Long?> {
    fun findByCustomerIdAndCampaignIdAndCapSourceAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        date: Date?
    ): List<WalmartCustomCampaignsKeywordBidCaps?>?

    fun findByCustomerIdAndCampaignIdAndKeywordText(
        customerId: Long?,
        campaignId: Long?,
        keyword: String?
    ): WalmartCustomCampaignsKeywordBidCaps?

    fun findByCustomerIdAndCampaignIdAndCapSourceAndKeywordTextAndMatchTypeId(
        customerId: Long?,
        campaignId: Long?,
        l: Long,
        keyword: String?,
        matchType: Int?
    ): WalmartCustomCampaignsKeywordBidCaps?

    fun findByCustomerIdAndCampaignIdAndKeywordTextAndUpc(
        customerId: Long?,
        databaseCampaignId: Long?,
        keywordText: String?,
        itemNo: String?
    ): WalmartCustomCampaignsKeywordBidCaps?

    fun findByCustomerIdAndCampaignIdAndKeywordTextAndUpcAndMatchTypeIdAndExpirationTimestampGreaterThanEqual(
        customerId: Long?,
        databaseCampaignId: Long?,
        keywordText: String?,
        itemNo: String?,
        matchType: Int?,
        date: Date?
    ): WalmartCustomCampaignsKeywordBidCaps?
}
