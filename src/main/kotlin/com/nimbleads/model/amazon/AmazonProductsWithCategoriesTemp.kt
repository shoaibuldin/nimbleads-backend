package com.nimbleads.model.amazon


import jakarta.persistence.*

@Table(schema = "amazon", catalog = "amazon", name = "amazon_product_with_categories_temp")
@Entity
class AmazonProductsWithCategoriesTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Column(name = "profile_id")
    private val profileId: String? = null

    @Column(name = "product_ads_response", length = 50000)
    var productAdsResponse: String? = null

    @Column(name = "categories", length = 50000)
    var categories: String? = null

    @Column(name = "database_categories", length = 50000)
    var databaseCategories: String? = null
}
