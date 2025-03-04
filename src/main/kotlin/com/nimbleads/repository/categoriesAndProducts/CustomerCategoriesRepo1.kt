package com.nimbleads.repository.categoriesAndProducts

import com.nimbleads.model.categoriesAndProducts.CustomerCategories
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerCategoriesRepo : JpaRepository<CustomerCategories?, Long?> {
    fun findByCustomerCategoryIdAndCustomerId(categoryId: Long?, customerId: Long?): CustomerCategories?
}
