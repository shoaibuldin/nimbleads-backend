package com.nimbleads.model.amazon



import java.util.*
import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "asin_target_asin_bid_caps")
@Entity
@IdClass(value = AsinTargetBidCapsKey::class)
class AsinTargetAsinBidCaps {
    @Id
    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Id
    @Column(name = "asin")
    private val asin: String? = null

    @Id
    @Column(name = "target_asin")
    private val targetAsin: String? = null

    @Id
    @Column(name = "cap_source")
    private val capSource: Long = 0

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
}
