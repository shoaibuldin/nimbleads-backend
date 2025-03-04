package com.nimbleads.model.walmart

import jakarta.persistence.*
import java.util.*


@Table(schema = "walmart", catalog = "walmart", name = "walmart_linked_external_campaigns")
@Entity
@IdClass(value = WalmartLinkedExternalCampaignsKey::class)
class WalmartLinkedExternalCampaigns {
    @Id
    @Column(name = "customer_id")
    var customerId: Long? = null

    @Id
    @Column(name = "na_campaign_id")
    var campaignId: Long? = null

    @Id
    @Column(name = "walmart_campaign_id")
    var walmartCampaignId: String? = null

    var enabled: Boolean? = null

    @Column(name = "create_timestamp")
    var createTimestamp: Date? = null
}
