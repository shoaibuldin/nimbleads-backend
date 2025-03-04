package com.nimbleads.model.reports


import jakarta.persistence.*

import java.util.*

@IdClass(value = ProductAdsDataKey::class)
@Table(catalog = "reportdb", name = "product_ads_data")
@Entity
class ProductAdsData {
    @Id
    private var date: Date? = null
    private var impressions: Long? = null
    private var clicks: Long? = null
    private var cost: Double? = null
    private var sales: Double? = null
    private var conversions: Long? = null
    private val sales7Day: Double? = null
    private val conversions7Day: Long? = null
    private val sales14Day: Double? = null
    private val conversions14Day: Long? = null
    private val sales30Day: Double? = null
    private val conversions30Day: Long? = null
    private val ctr: Double? = null
    private val cpc: Double? = null

    @Id
    private val customer: Long? = null

    @Id
    @Column(name = "profile_id")
    private var profileId: Long? = null

    @Id
    private val asin: String? = null

    @Id
    private val sku: String? = null
    private var productName: String? = null

    constructor()

    constructor(
        productName: String?,
        impressions: Long?,
        clicks: Long?,
        cost: Double?,
        conversions: Long?,
        sales: Double?,
        date: Date?
    ) {
        this.productName = productName
        this.impressions = impressions
        this.clicks = clicks
        this.cost = cost
        this.conversions = conversions
        this.sales = sales
        this.date = date
    }
}
