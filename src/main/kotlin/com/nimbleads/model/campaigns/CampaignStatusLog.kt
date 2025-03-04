package com.nimbleads.model.campaigns

import jakarta.persistence.*
import java.util.*

@Table(schema = "campaigns", catalog = "campaigns", name = "campaign_status_log")
@Entity
@IdClass(value = CampaignStatusLogKey::class)
class CampaignStatusLog {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Id
    @Column(name = "adgroup_id")
    private var adgroupId: Long? = null

    @Id
    @Column(name = "ad_id")
    private var adId: Long? = null

    @Column(name = "amazon_profile_id")
    private var amazonProfileId: Long? = null

    private val state: String? = null

    private val sku: String? = null

    private val asin: String? = null

    @Column(name = "creation_date")
    private var creationDate: Date? = null

    @Column(name = "last_update_date")
    private var lastUpdateDate: Date? = null

    @Column(name = "serving_status")
    private var servingStatus: String? = null

    @Id
    @Column(name = "rec_logged_at")
    private var recLoggedAt: Date? = null

    @Transient
    private val campaignName: String? = null
}
