package com.nimbleads.model.walmart

import jakarta.persistence.*


@Table(schema = "walmart", catalog = "walmart", name = "walmart_campaign_placements")
@Entity
@IdClass(value = WalmartCampaignPlacementsKey::class)
class WalmartCampaignPlacements {
    @Id
    @Column(name = "customer_id")
    var customerId: Long? = null

    @Id
    @Column(name = "na_campaign_id")
    var campaignId: Long? = null

    @Column(name = "search_carousel")
    var searchCarousel: Boolean = false

    @Column(name = "item_buybox")
    var itemBuyBox: Boolean = false

    @Column(name = "item_carousel")
    var itemCarousel: Boolean = false
}
