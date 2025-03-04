package com.nimbleads.repository.categoriesAndProducts

import com.nimbleads.model.categoriesAndProducts.CustomerProductMarketplace
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerProductMarketplaceRepo : JpaRepository<CustomerProductMarketplace?, Long?> {
    fun findByCustomerProductIdAndCustomerId(customerProductId: String?, customerId: Long?): CustomerProductMarketplace?

    fun findByMarketplaceProductIdAndCustomerId(asin: String?, customerId: Long?): List<CustomerProductMarketplace?>?

    fun findByMarketplaceProductIdAndCustomerIdAndMarketplaceId(
        customerProductId: String?,
        customerId: Long?,
        marketplaceId: Long
    ): CustomerProductMarketplace?
}
