package com.nimbleads.model.instacart

import jakarta.persistence.*
import java.util.*


@Table(schema = "instacart", catalog = "instacart", name = "instacart_linked_external_campaigns")
@Entity
@IdClass(value = InstacartLinkedExternalCampaignsKey::class)
class InstacartLinkedExternalCampaigns {
    @Id
    @Column(name = "customer_id")
    var customerId: Long? = null

    @Id
    @Column(name = "na_campaign_id")
    var campaignId: Long? = null

    @Id
    @Column(name = "instacart_campaign_id")
    var instacartCampaignId: String? = null

    var enabled: Boolean? = null

    @Column(name = "create_timestamp")
    var createTimestamp: Date? = null
}
