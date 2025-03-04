package com.nimbleads.model.amazon



import java.util.*
import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "custom_campaigns_keyword_bid_caps")
@Entity
@IdClass(value = CustomCampaignKeywordBidCapsKey::class)
class CustomCampaignsKeywordBidCaps {
    @Id
    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private val campaignId: Long? = null

    @Id
    @Column(name = "keyword_text")
    private val keywordText: String? = null

    @Id
    @Column(name = "match_type_id")
    private val matchTypeId: Int? = null

    @Id
    @Column(name = "cap_source")
    private val capSource: Long? = null

    @Column(name = "min_bid")
    private val minBid: Double? = null

    @Column(name = "max_bid")
    private val maxBid: Double? = null

    @Column(name = "clicks")
    private val clicks: Long? = null

    @Column(name = "cost")
    private val cost: Double? = null

    @Column(name = "conversions")
    private val conversions: Long? = null

    @Column(name = "sales")
    private val sales: Double? = null

    @Column(name = "cpc")
    private val cpc: Double? = null

    @Column(name = "roas")
    private val roas: Double? = null

    @Column(name = "last_update_timestamp")
    private val lastUpdateTimestamp: Date? = null

    @Column(name = "EXPIRATION_TIMESTAMP")
    private val expirationTimestamp: Date? = null


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
