package com.nimbleads.repository.instacart

import com.nimbleads.model.instacart.InstacartCampaignUpcs
import org.springframework.data.jpa.repository.JpaRepository

interface InstacartCampaignUpcsRepo : JpaRepository<InstacartCampaignUpcs?, Long?> {
    fun findByInstacartCampaignId(campaignId: String?): List<InstacartCampaignUpcs?>?
}
