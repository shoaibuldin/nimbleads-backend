package com.nimbleads.model.categoriesAndProducts

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator


@Table(schema = "categories_and_products", catalog = "categories_and_products", name = "marketplace_categories")
@Entity
class MarketplaceCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "category_id")
    private var categoryId: Long? = null

    @Column(name = "marketplace_id")
    private var marketplaceId: Long? = null
    private val name: String? = null

    @Column(name = "marketplace_parent_category_id")
    private var marketplaceParentCategoryId: Long? = null

    @Column(name = "marketplace_category_id")
    private var marketplaceCategoryId: Long? = null
}
