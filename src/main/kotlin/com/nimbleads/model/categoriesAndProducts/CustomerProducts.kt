package com.nimbleads.model.categoriesAndProducts

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator


@Table(schema = "categories_and_products", catalog = "categories_and_products", name = "customer_products")
@Entity
@IdClass(value = CustomerProductsKey::class)
class CustomerProducts {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "customer_product_id")
    private var customerProductId: String? = null

    @Column(name = "customer_category_id")
    private var customerCategoryId: Long? = null


    private val name: String? = null

    // TODO:
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "na_product_id", nullable = false, unique = true)
    private var naProductId: Long? = null


    @Transient
    private val campaignId: Long? = null

    @Transient
    private val customerCategory: CustomerCategories? = null

    @Transient
    private val customerProductMarketplace: CustomerProductMarketplace? = null
}
