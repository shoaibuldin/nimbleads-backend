package com.nimbleads.model.campaigns

import jakarta.persistence.*


@Table(schema = "campaigns", catalog = "campaigns", name = "campaign_products")
@Entity
@IdClass(value = CampaignProductsKey::class)
class CampaignProducts {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Id
    @Column(name = "customer_product_id")
    private var customerProductId: String? = null
    private val enabled: Boolean? = null
}
