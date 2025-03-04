package com.nimbleads.repository.categoriesAndProducts

import com.nimbleads.model.categoriesAndProducts.MarketplaceCategories
import org.springframework.data.jpa.repository.JpaRepository

interface MarketplaceCategoriesRepo : JpaRepository<MarketplaceCategories?, Long?> {
    fun existsByMarketplaceCategoryId(marketplaceCatId: Long?): Boolean?

    fun findByMarketplaceCategoryId(marketplaceCategoryId: Long?): MarketplaceCategories?

    fun findByMarketplaceParentCategoryId(parentMarketplaceCategoryId: Long?): List<MarketplaceCategories?>?

    fun findByName(name: String?): MarketplaceCategories?
}
