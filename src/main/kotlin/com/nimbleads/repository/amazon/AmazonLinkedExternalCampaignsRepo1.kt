package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AmazonLinkedExternalCampaigns
import org.springframework.data.jpa.repository.JpaRepository

interface AmazonLinkedExternalCampaignsRepo : JpaRepository<AmazonLinkedExternalCampaigns?, Long?> {
    fun findByCustomerId(customerId: Long?): List<AmazonLinkedExternalCampaigns?>?

    fun findByCustomerIdAndEnabled(customerId: Long?, b: Boolean): List<AmazonLinkedExternalCampaigns?>?

    fun findByAmazonCampaignId(campaignId: Long?): AmazonLinkedExternalCampaigns?

    fun findByAmazonCampaignIdAndCustomerId(amazonCampaignId: Long?, customerId: Long?): AmazonLinkedExternalCampaigns?
}
