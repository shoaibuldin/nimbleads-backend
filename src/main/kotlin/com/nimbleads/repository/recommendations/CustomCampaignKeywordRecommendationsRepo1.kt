package com.nimbleads.repository.recommendations

import com.nimbleads.model.recommendations.CustomCampaignKeywordRecommendations
import org.springframework.data.jpa.repository.JpaRepository


interface CustomCampaignKeywordRecommendationsRepo : JpaRepository<CustomCampaignKeywordRecommendations?, Long?> {
    fun existsByCampaignIdAndKeywordText(campaignId: Long?, keywordText: String?): Boolean

    fun findByCampaignIdAndKeywordText(campaignId: Long?, keyword: String?): CustomCampaignKeywordRecommendations?

    fun findByCampaignIdAndKeywordTextAndMatchTypeId(
        campaignId: Long?,
        keyword: String?,
        matchType: Int?
    ): CustomCampaignKeywordRecommendations?


    fun findByCampaignIdAndCustomerId(campaignId: Long?, customer: Long?): List<CustomCampaignKeywordRecommendations?>?
}
