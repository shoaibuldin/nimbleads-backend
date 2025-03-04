package com.nimbleads.model.walmart

import jakarta.persistence.*
import java.util.*


@Table(schema = "walmart", catalog = "walmart", name = "na_walmart_linked_profiles")
@Entity
@IdClass(value = NaWalmartLinkedProfilesKey::class)
class NaWalmartLinkedProfiles {
    @Id
    @Column(name = "na_customer_id")
    private var naCustomerId: Long? = null

    @Id
    @Column(name = "na_top_level_portfolio_id")
    private var naTopLevelPortfolioId: Long? = null


    @Column(name = "walmart_profile_id")
    private var walmartProfileId: String? = null

    @Column(name = "is_vendor")
    private var isVendor: String? = null

    @Column(name = "reporting_start_date")
    private var reportingStartDate: Date? = null

    @Column(name = "reporting_end_date")
    private var reportingEndDate: Date? = null

    @Column(name = "default_wholesale_price")
    private var defaultWholesalePrice: Double? = null

    @Column(name = "default_cogs")
    private var defaultCogs: Double? = null

    @Column(name = "walmart_geo_id")
    private var walmartGeoId: String? = null

    @Column(name = "add_category_targets")
    private var addCategoryTargets: String? = null
}
