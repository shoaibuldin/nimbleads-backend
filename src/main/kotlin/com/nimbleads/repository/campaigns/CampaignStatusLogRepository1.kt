package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.CampaignStatusLog
import com.nimbleads.model.campaigns.CampaignStatusLogKey
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CampaignStatusLogRepository : JpaRepository<CampaignStatusLog?, CampaignStatusLogKey?> {
    fun findAllByCampaignIdAndRecLoggedAtGreaterThan(campaignId: Long?, recLoggedAt: Date?): List<CampaignStatusLog?>?

    fun findTopByCampaignIdOrderByRecLoggedAtDesc(campaignId: Long?): CampaignStatusLog?

    fun findAllByCustomerIdAndCampaignIdAndRecLoggedAtBetween(
        customerId: Long?,
        campaignId: Long?,
        startDate: Date?,
        endDate: Date?
    ): List<CampaignStatusLog?>?

    fun findAllByCustomerIdAndRecLoggedAtBetween(
        customerId: Long?,
        startDate: Date?,
        endDate: Date?
    ): List<CampaignStatusLog?>?

    fun findAllByCustomerIdAndCampaignIdAndRecLoggedAtAfterOrderByRecLoggedAtDesc(
        customerId: Long?,
        campaignId: Long?,
        d: Date?
    ): List<CampaignStatusLog?>?
}
