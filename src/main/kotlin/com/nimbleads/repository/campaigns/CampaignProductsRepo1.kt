package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.CampaignProducts
import org.springframework.data.jpa.repository.JpaRepository

interface CampaignProductsRepo : JpaRepository<CampaignProducts?, Long?> {
    fun findByCustomerIdAndCustomerProductId(customerId: Long?, productId: String?): List<CampaignProducts?>?

    fun findByCustomerIdAndCustomerProductIdAndCampaignId(
        customerId: Long?,
        productId: String?,
        campaignId: Long?
    ): List<CampaignProducts?>?


    fun findByCustomerIdAndCampaignId(customer: Long?, campaignId: Long?): List<CampaignProducts?>?
}
