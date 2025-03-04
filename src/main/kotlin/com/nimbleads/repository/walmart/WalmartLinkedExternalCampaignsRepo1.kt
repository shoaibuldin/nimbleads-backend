package com.nimbleads.repository.walmart

import com.nimbleads.model.walmart.WalmartLinkedExternalCampaigns
import org.springframework.data.jpa.repository.JpaRepository

interface WalmartLinkedExternalCampaignsRepo : JpaRepository<WalmartLinkedExternalCampaigns?, Long?> {
    fun findByCustomerId(customerId: Long?): List<WalmartLinkedExternalCampaigns?>?

    fun findByCustomerIdAndEnabled(customerId: Long?, b: Boolean): List<WalmartLinkedExternalCampaigns?>?

    fun findByWalmartCampaignIdAndCustomerId(
        WalmartCampaignId: String?,
        customerId: Long?
    ): WalmartLinkedExternalCampaigns?
}
