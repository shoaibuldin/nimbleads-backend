package com.nimbleads.model.instacart

import jakarta.persistence.*
import java.util.*


@Table(schema = "instacart", catalog = "instacart", name = "na_instacart_linked_profiles")
@Entity
@IdClass(value = NaInstaCartLinkedProfilesKey::class)
class NaInstaCartLinkedProfiles {
    @Id
    @Column(name = "na_customer_id")
    private var naCustomerId: Long? = null

    @Id
    @Column(name = "na_top_level_portfolio_id")
    private var naTopLevelPortfolioId: Long? = null


    @Column(name = "instacart_profile_id")
    private var instaCartProfileId: String? = null

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

    @Column(name = "instacart_geo_id")
    private var instaCartGeoId: String? = null

    @Column(name = "add_category_targets")
    private var addCategoryTargets: String? = null
}
