package com.nimbleads.repository.instacart

import com.nimbleads.model.instacart.InstacartLinkedExternalCampaigns
import org.springframework.data.jpa.repository.JpaRepository

interface InstacartLinkedExternalCampaignsRepo : JpaRepository<InstacartLinkedExternalCampaigns?, Long?> {
    fun findByCustomerId(customerId: Long?): List<InstacartLinkedExternalCampaigns?>?

    fun findByCustomerIdAndEnabled(customerId: Long?, b: Boolean): List<InstacartLinkedExternalCampaigns?>?

    fun findByInstacartCampaignIdAndCustomerId(
        InstacartCampaignId: String?,
        customerId: Long?
    ): InstacartLinkedExternalCampaigns?
}
