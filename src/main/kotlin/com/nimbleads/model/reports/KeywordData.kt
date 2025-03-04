package com.nimbleads.model.reports

import jakarta.persistence.*

import java.util.*

@Entity
@IdClass(value = KeywordDataKey::class)
@Table(catalog = "reportdb", name = "keyword_data")
class KeywordData {
    private var impressions: Long? = null
    private var clicks: Long? = null
    private var cost: Double? = null
    private var sales: Double? = null
    private var conversions: Long? = null
    private val ctr: Double? = null
    private val cpc: Double? = null

    @Id
    private var date: Date? = null

    @Id
    private var customer: Long? = null

    @Id
    @Column(name = "profile_id")
    private var profileId: Long? = null

    @Id
    private var keyword: String? = null

    @Id
    private var query: String? = null

    @Id
    @Column(name = "campaign_targeting_type")
    private var campaignTargetingType: String? = null
    private val sales7Day: Double? = null
    private val sales14Day: Double? = null
    private val sales30Day: Double? = null
    private val conversions7Day: Long? = null
    private val conversions14Day: Long? = null
    private val conversions30Day: Long? = null

    constructor()

    constructor(sales: Double?, conversions: Long?, date: Date?, customer: Long?, keyword: String?, query: String?) {
        this.sales = sales
        this.conversions = conversions
        this.date = date
        this.customer = customer
        this.keyword = keyword
        this.query = query
    }

    constructor(
        impressions: Long?, clicks: Long?, cost: Double?,
        sales: Double?, conversions: Long?, date: Date?,
        customer: Long?, keyword: String?, query: String?,
        campaignTargetingType: String?
    ) {
        this.impressions = impressions
        this.clicks = clicks
        this.cost = cost
        this.sales = sales
        this.conversions = conversions
        this.date = date
        this.customer = customer
        this.keyword = keyword
        this.query = query
        this.campaignTargetingType = campaignTargetingType
    }
}
