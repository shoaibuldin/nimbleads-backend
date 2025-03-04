package com.nimbleads.model.amazon



import java.util.*
import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "na_amazon_linked_profiles")
@Entity
@IdClass(value = NaAmaonLinkedProfilesKey::class)
class NaAmazonLinkedProfiles {
    @Id
    @Column(name = "na_customer_id")
    private val naCustomerId: Long? = null

    @Id
    @Column(name = "na_top_level_portfolio_id")
    private val naTopLevelPortfolioId: Long? = null


    @Column(name = "amazon_profile_id")
    private val amazonProfileId: String? = null

    @Column(name = "is_vendor")
    private val isVendor: String? = null

    @Column(name = "reporting_start_date")
    private val reportingStartDate: Date? = null

    @Column(name = "reporting_end_date")
    private val reportingEndDate: Date? = null

    @Column(name = "default_wholesale_price")
    private val defaultWholesalePrice: Double? = null

    @Column(name = "default_cogs")
    private val defaultCogs: Double? = null

    @Column(name = "amazon_geo_id")
    private val amazonGeoId: String? = null

    @Column(name = "add_category_targets")
    private val addCategoryTargets: String? = null

    @Column(name = "is_default")
    private val defaultProfile: Boolean? = null
}
