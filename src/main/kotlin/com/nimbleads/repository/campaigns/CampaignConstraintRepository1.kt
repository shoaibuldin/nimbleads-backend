package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.CampaignConstraints
import org.springframework.data.jpa.repository.JpaRepository

interface CampaignConstraintRepository : JpaRepository<CampaignConstraints?, Long?> {
    fun findAllByCampaignIdIn(campaignIds: List<Long?>?): List<CampaignConstraints?>?

    fun findTopByCustomerIdAndCampaignIdOrderByStartDateDesc(customerId: Long?, campaignId: Long?): CampaignConstraints?
}
