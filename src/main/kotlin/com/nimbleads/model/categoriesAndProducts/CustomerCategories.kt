package com.nimbleads.model.categoriesAndProducts

import jakarta.persistence.*


@Table(schema = "categories_and_products", catalog = "categories_and_products", name = "customer_categories")
@Entity
@IdClass(value = CustomerCategoriesKey::class)
class CustomerCategories {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "customer_category_id")
    private var customerCategoryId: Long? = null

    @Column(name = "customer_parent_category_id")
    private var customerParentCategoryId: Long? = null
    private val name: String? = null
}
