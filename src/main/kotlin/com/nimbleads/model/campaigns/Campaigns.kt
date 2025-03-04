package com.nimbleads.model.campaigns


import jakarta.persistence.*




@Table(schema = "campaigns", catalog = "campaigns", name = "campaigns")
@Entity
@IdClass(value = CampaignsKey::class)
class Campaigns {
    @Id
    @Column(name = "customer_id")
    var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    var campaignId: Long? = null

    @Column(name = "is_default_campaign")
    var defaultCampaign: Boolean? = null

    @Column(name = "is_external_campaign")
    var externalCampaign: Boolean? = null

    @Column(name = "campaign_type")
    var campaignType: Int? = null

    @Column(name = "portfolio_id")
    var portfolioId: Long? = null

    var name: String? = null

    @Column(name = "marketplace_id")
    var marketplaceId: Long? = null

    @Column(name = "marketplace_geo_id")
    var marketplaceGeoId: String? = null

    @Column(name = "takeover_instacart_analytics_keywords")
    var takeoverInstacartAnalyticsKeywords: Boolean = true
    var enabled: Boolean? = null
}
