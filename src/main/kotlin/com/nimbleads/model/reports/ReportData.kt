package com.nimbleads.model.reports


import jakarta.persistence.*

import java.util.*

@Entity
@IdClass(value = ReportDataKey::class)
@Table(catalog = "reportdb", name = "report_data")
class ReportData {
    @Id
    private var customer: Long? = null

    @Id
    @Column(name = "profile_id")
    private var profileId: Long? = null

    @Id
    private var date: Date? = null

    private var impressions: Long? = null
    private var clicks: Long? = null
    private var cost: Double? = null
    private var conversions: Long? = null

    @Column(name = "Units_Sold")
    private var unitsSold: Long? = null
    private var sales: Double? = null

    @Column(name = "Conversions7day")
    private var conversions7Day: Long? = null

    @Column(name = "Units_Sold7day")
    private var unitsSold7Day: Long? = null

    @Column(name = "Sales7day")
    private var sales7Day: Double? = null

    @Column(name = "Conversions14day")
    private var conversions14Day: Long? = null

    @Column(name = "Sales14day")
    private var sales14Day: Double? = null

    @Column(name = "Conversions30day")
    private var conversions30Day: Long? = null

    @Column(name = "Units_Sold30day")
    private var unitsSold30Day: Long? = null

    @Column(name = "Sales30day")
    private var sales30Day: Double? = null

    @Column(name = "Sales1day")
    private var sales1Day: Double? = null

    @Column(name = "Units_Sold14day")
    private var unitsSold14Day: Long? = null

    @Column(name = "Conversions1day")
    private var conversions1Day: Double? = null

    @Column(name = "Units_Sold1day")
    private var unitsSold1Day: Long? = null

    constructor()

    constructor(
        customer: Long?,
        profileId: Long?,
        reportDate: Date?,
        impressions: Long?,
        clicks: Long?,
        cost: Double?,
        conversions: Long?,
        unitsSold: Long?,
        sales: Double?,
        conversions7Day: Long?,
        unitsSold7Day: Long?,
        sales7Day: Double?,
        conversions14Day: Long?,
        sales14Day: Double?,
        conversions30Day: Long?,
        unitsSold30Day: Long?,
        sales30Day: Double?,
        sales1Day: Double?,
        unitsSold14Day: Long?,
        conversions1Day: Double?,
        unitsSold1Day: Long?
    ) {
        this.customer = customer
        this.profileId = profileId
        this.date = reportDate
        this.impressions = impressions
        this.clicks = clicks
        this.cost = cost
        this.conversions = conversions
        this.unitsSold = unitsSold
        this.sales = sales
        this.conversions7Day = conversions7Day
        this.unitsSold7Day = unitsSold7Day
        this.sales7Day = sales7Day
        this.conversions14Day = conversions14Day
        this.sales14Day = sales14Day
        this.conversions30Day = conversions30Day
        this.unitsSold30Day = unitsSold30Day
        this.sales30Day = sales30Day
        this.sales1Day = sales1Day
        this.unitsSold14Day = unitsSold14Day
        this.conversions1Day = conversions1Day
        this.unitsSold1Day = unitsSold1Day
    }
}
