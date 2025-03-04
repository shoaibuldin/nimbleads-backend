package com.nimbleads.repository.walmart

import com.nimbleads.model.walmart.WalmartCampaignPlacements
import org.springframework.data.jpa.repository.JpaRepository

interface WalmartCampaignPlacementsRepo : JpaRepository<WalmartCampaignPlacements?, Long?> {
    fun findByCampaignIdAndCustomerId(campaignId: Long?, customerId: Long?): WalmartCampaignPlacements?
}
