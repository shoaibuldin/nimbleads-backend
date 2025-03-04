package com.nimbleads.model.walmart

import jakarta.persistence.*
import java.util.*


@Table(schema = "walmart", catalog = "walmart", name = "custom_campaigns_keyword_bid_caps")
@Entity
@IdClass(value = WalmartCustomCampaignsKeywordBidCapsKey::class)
class WalmartCustomCampaignsKeywordBidCaps {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Id
    @Column(name = "keyword_text")
    private var keywordText: String? = null

    @Id
    @Column(name = "match_type_id")
    private var matchTypeId: Int? = null

    @Id
    @Column(name = "cap_source")
    private var capSource: Long? = null

    @Id
    @Column(name = "upc")
    private var upc: String? = null

    @Column(name = "min_bid")
    private var minBid: Double? = null

    @Column(name = "max_bid")
    private var maxBid: Double? = null

    @Column(name = "clicks")
    private var clicks: Long? = null

    @Column(name = "cost")
    private var cost: Double? = null

    @Column(name = "conversions")
    private var conversions: Long? = null

    @Column(name = "sales")
    private var sales: Double? = null

    @Column(name = "cpc")
    private var cpc: Double? = null

    @Column(name = "roas")
    private var roas: Double? = null

    @Column(name = "last_update_timestamp")
    private var lastUpdateTimestamp: Date? = null

    @Column(name = "EXPIRATION_TIMESTAMP")
    private var expirationTimestamp: Date? = null


    @Transient
    private val expirationDate: String? = null

    override fun toString(): String {
        return "{" +
                "keywordText='" + keywordText + '\'' +
                ", matchTypeId=" + (if (matchTypeId == 1) "exact" else (if (matchTypeId == 2) "broad" else (if (matchTypeId == 3) "phrase" else "unknown"))) +
                ", minBid=" + minBid +
                ", maxBid=" + maxBid +
                ", expirationTimestamp=" + expirationTimestamp +
                '}'
    }
}
