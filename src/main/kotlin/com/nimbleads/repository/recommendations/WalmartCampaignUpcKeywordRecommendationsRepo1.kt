package com.nimbleads.repository.recommendations

import com.nimbleads.model.recommendations.WalmartCampaignUpcKeywordRecommendations
import org.springframework.data.jpa.repository.JpaRepository


interface WalmartCampaignUpcKeywordRecommendationsRepo :
    JpaRepository<WalmartCampaignUpcKeywordRecommendations?, Long?> {
    fun existsByCampaignIdAndKeywordText(campaignId: Long?, keywordText: String?): Boolean

    fun findByCampaignIdAndKeywordText(campaignId: Long?, keyword: String?): WalmartCampaignUpcKeywordRecommendations?

    fun findByCampaignIdAndKeywordTextAndMatchTypeId(
        campaignId: Long?,
        keyword: String?,
        matchType: Int?
    ): WalmartCampaignUpcKeywordRecommendations?


    fun findByCampaignIdAndCustomerId(
        campaignId: Long?,
        customer: Long?
    ): List<WalmartCampaignUpcKeywordRecommendations?>?
}
