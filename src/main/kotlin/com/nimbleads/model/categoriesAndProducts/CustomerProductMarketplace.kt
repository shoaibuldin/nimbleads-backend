package com.nimbleads.model.categoriesAndProducts

import jakarta.persistence.*


@Table(schema = "categories_and_products", catalog = "categories_and_products", name = "customer_product_marketplace")
@Entity
@IdClass(value = CustomerProductMarketplaceKey::class)
class CustomerProductMarketplace {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "customer_product_id")
    private var customerProductId: String? = null

    @Id
    @Column(name = "marketplace_id")
    private var marketplaceId: Long? = null

    @Column(name = "marketplace_product_id")
    private var marketplaceProductId: String? = null
    private val enabled: Boolean? = null
}
