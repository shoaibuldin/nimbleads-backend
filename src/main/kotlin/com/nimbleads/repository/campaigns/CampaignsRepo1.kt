package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.Campaigns
import com.nimbleads.model.campaigns.CampaignsKey
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CampaignsRepo : JpaRepository<Campaigns?, CampaignsKey?> {
    fun findTopByOrderByCampaignIdDesc(): Campaigns?

    fun findByCampaignId(campaignId: Long?): Campaigns?

    fun findAllByCustomerIdAndPortfolioId(customerId: Long?, portfolioId: Long?): List<Campaigns?>?

    fun findByNameAndCustomerIdAndCampaignType(sku: String?, customerId: Long?, i: Int): Campaigns?

    fun existsByNameAndCustomerId(sku: String?, customerId: Long?): Boolean?

    fun findByCampaignIdAndCustomerId(campaignId: Long?, naCustomerId: Long?): Campaigns?

    fun findAllByCustomerId(customerId: Long?): List<Campaigns?>?

    fun findAllByCustomerIdAndDefaultCampaign(customerId: Long?, b: Boolean): List<Campaigns?>?

    fun findAllByCustomerIdAndDefaultCampaignAndCampaignTypeIn(
        customerId: Long?,
        b: Boolean,
        campaignTypes: List<Int?>?
    ): List<Campaigns?>?

    fun findAllByCustomerIdAndName(customerId: Long?, campaignName: String?): Campaigns?

    @Query(
        value = """SELECT c.campaign_id as campaignId
FROM campaigns c
         inner join campaign_products cp on c.campaign_id = cp.campaign_id
WHERE c.customer_id = ?1
  and c.campaign_type=0
  and c.enabled=1
  and cp.customer_product_id = ?2""", nativeQuery = true
    )
    fun getCampaignForProduct(customerId: Long?, customerProductId: String?): Array<Long?>?

    @Query(value = "SELECT c.campaign_id as campaignId from campaigns c where c.customer_id = ?1", nativeQuery = true)
    fun getCampaignIds(customerId: Long?): List<Long?>?
}
