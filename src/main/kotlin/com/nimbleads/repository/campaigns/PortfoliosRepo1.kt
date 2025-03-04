package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.Portfolios
import com.nimbleads.model.campaigns.PortfoliosKey
import org.springframework.data.jpa.repository.JpaRepository

interface PortfoliosRepo : JpaRepository<Portfolios?, PortfoliosKey?> {
    fun findByPortfolioIdAndCustomerId(categoryId: Long?, customerId: Long?): Portfolios?

    fun existsByPortfolioIdAndCustomerId(marketplaceCategoryId: Long?, customerId: Long?): Boolean

    fun findByCustomerId(customerId: Long?): List<Portfolios?>?

    fun findByCustomerIdAndParentPortfolioId(customerId: Long?, l: Long): List<Portfolios?>?

    fun findTopByCustomerIdAndParentPortfolioIdOrderByPortfolioIdDesc(customerId: Long?, l: Long): Portfolios?

    fun findByCustomerIdAndParentPortfolioIdAndEnabled(
        customerId: Long?,
        naTopLevelPortfolioId: Long?,
        b: Boolean
    ): List<Portfolios?>?

    fun findByCustomerIdAndPortfolioId(customerId: Long?, naTopLevelPortfolioId: Long?): List<Portfolios?>?

    fun findByCustomerIdAndName(customerId: Long?, name: String?): Portfolios?
}
