package com.nimbleads.repository.recommendations

import com.nimbleads.model.recommendations.CustomCampaignAsinTargetAsinRecommendations
import org.springframework.data.jpa.repository.JpaRepository


interface CustomCampaignAsinTargetRecommendationsRepo :
    JpaRepository<CustomCampaignAsinTargetAsinRecommendations?, Long?> {
    fun existsByCampaignIdAndTargetAsin(campaignId: Long?, targetAsin: String?): Boolean

    fun findByCustomerIdAndCampaignIdAndTargetAsin(
        customerId: Long?,
        campaignId: Long?,
        targetAsin: String?
    ): CustomCampaignAsinTargetAsinRecommendations?

    fun existsByCustomerIdAndCampaignIdAndTargetAsin(customerId: Long?, campaignId: Long?, targetAsin: String?): Boolean
}
