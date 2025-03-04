package com.nimbleads.repository.categoriesAndProducts

import com.nimbleads.model.categoriesAndProducts.CustomerProducts
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerProductsRepo : JpaRepository<CustomerProducts?, Long?> {
    fun findByCustomerId(customerId: Long?): List<CustomerProducts?>?

    fun existsByCustomerIdAndCustomerProductId(customerId: Long?, sku: String?): Boolean?

    fun findTopByOrderByNaProductIdDesc(): CustomerProducts?

    fun findByCustomerProductId(sku: String?): List<CustomerProducts?>?
}
