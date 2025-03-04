package com.nimbleads.repository.categoriesAndProducts

import com.nimbleads.model.categoriesAndProducts.CustomerProductMarketplaceCosts
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerProductMarketplaceCostRepo : JpaRepository<CustomerProductMarketplaceCosts?, Long?> {
    fun existsByCustomerIdAndCustomerProductIdAndMarketplaceId(
        customerId: Long?,
        customerProductId: String?,
        marketplaceId: Long?
    ): Boolean
}
