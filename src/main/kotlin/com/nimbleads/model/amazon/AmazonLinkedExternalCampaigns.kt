package com.nimbleads.model.amazon



import jakarta.persistence.*
import java.util.*


@Table(schema = "amazon", catalog = "amazon", name = "amazon_linked_external_campaigns")
@Entity
@IdClass(value = AmazonLinkedExternalCampaignsKey::class)
class AmazonLinkedExternalCampaigns {
    @Id
    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Id
    @Column(name = "na_campaign_id")
    private val campaignId: Long? = null

    @Id
    @Column(name = "amazon_campaign_id")
    private val amazonCampaignId: Long? = null

    private val enabled: Boolean? = null

    @Column(name = "create_timestamp")
    private val createTimestamp: Date? = null

    @Column(name = "portfolio_id")
    private val portfolioId: Long? = null
}
