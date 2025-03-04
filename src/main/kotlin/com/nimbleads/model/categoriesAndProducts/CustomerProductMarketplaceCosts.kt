package com.nimbleads.model.categoriesAndProducts

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.util.*


@Table(
    schema = "categories_and_products",
    catalog = "categories_and_products",
    name = "customer_product_marketplace_costs"
)
@Entity
class CustomerProductMarketplaceCosts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @Column(name = "rec_id")
    @GenericGenerator(name = "native", strategy = "native")
    private var recId: Long? = null

    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Column(name = "marketplace_id")
    private var marketplaceId: Long? = null

    @Column(name = "customer_product_id")
    private var customerProductId: String? = null

    @Column(name = "marketplace_geo_id")
    private var marketplaceGeoId: String? = null
    private val cogs: Double? = null

    @Column(name = "wholesale_price")
    private var wholesalePrice: Double? = null

    @Column(name = "start_datetime")
    private var startDatetime: Date? = null
}
