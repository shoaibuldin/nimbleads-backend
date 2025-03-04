package com.nimbleads.model.instacart

import jakarta.persistence.*
import java.util.*


@Table(schema = "instacart", catalog = "instacart", name = "instacart_campaign_upcs")
@Entity
@IdClass(value = InstacartCampaignUpcsKey::class)
class InstacartCampaignUpcs {
    @Id
    @Column(name = "na_customer_id")
    var naCustomerId: Long? = null

    @Id
    @Column(name = "instacart_campaign_id")
    var instacartCampaignId: String? = null

    @Id
    @Column(name = "instacart_adgroup_id")
    var instacartAdgroupId: String? = null

    var upcs: String? = null

    @Column(name = "LAST_UPDATE_TIMESTAMP")
    var lastUpdatedTimestamp: Date? = null
}
