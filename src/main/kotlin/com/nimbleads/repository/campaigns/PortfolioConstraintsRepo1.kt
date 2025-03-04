package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.PortfolioConstraints
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PortfolioConstraintsRepo : JpaRepository<PortfolioConstraints?, Long?> {
    fun existsByPortfolioIdAndCustomerId(portfolioId: Long, customerId: Long?): Boolean

    @Query(
        value = "SELECT min(start_date ), customer_id  FROM campaigns.portfolio_constraints pc " +
                "WHERE customer_id=?1 group by customer_id", nativeQuery = true
    )
    fun findCampaignStartingDate(customerId: Long): List<Array<Any?>?>?

    fun findTopByCustomerIdAndPortfolioIdOrderByStartDateDesc(
        customerId: Long?,
        portfolioId: Long?
    ): PortfolioConstraints?

    fun findTopByCustomerIdAndPortfolioId(customerId: Long?, portfolioId: Long?): PortfolioConstraints?
    fun findByCustomerIdAndPortfolioId(customerId: Long?, portfolioId: Long?): PortfolioConstraints?
    fun findByCustomerId(customerId: Long?): PortfolioConstraints?

    fun findAllByCustomerIdAndPortfolioIdOrderByStartDateDesc(
        customerId: Long?,
        portfolioId: Long?
    ): List<PortfolioConstraints?>?

    fun findTop2ByCustomerIdAndPortfolioIdOrderByStartDateDesc(
        customerId: Long?,
        portfolioId: Long?
    ): List<PortfolioConstraints?>?

    fun findOneByRecId(recId: Long?): PortfolioConstraints?

    fun findOneByCustomerIdAndPortfolioIdAndStartDate(
        customerId: Long?,
        portfolioId: Long?,
        startDate: Date?
    ): PortfolioConstraints?

    fun findTopByCustomerIdAndPortfolioIdAndStartDateLessThanOrderByStartDateDesc(
        customerId: Long?,
        portfolioId: Long?,
        startDate: Date?
    ): PortfolioConstraints?
}
