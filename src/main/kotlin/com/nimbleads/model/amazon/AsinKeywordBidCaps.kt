package com.nimbleads.model.amazon



import java.util.*
import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "asin_keyword_bid_caps")
@Entity
@IdClass(value = AsinKeywordBidCapsKey::class)
class AsinKeywordBidCaps {
    @Id
    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Id
    @Column(name = "asin")
    private val asin: String? = null

    @Id
    @Column(name = "keyword_text")
    private val keywordText: String? = null

    @Id
    @Column(name = "match_type_id")
    private val matchTypeId: Long? = null

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
                ", matchTypeId=" + (if (matchTypeId == 1L) "exact" else (if (matchTypeId == 2L) "broad" else (if (matchTypeId == 3L) "phrase" else "unknown"))) +
                ", minBid=" + minBid +
                ", maxBid=" + maxBid +
                ", expirationTimestamp=" + expirationTimestamp +
                '}'
    }
}
