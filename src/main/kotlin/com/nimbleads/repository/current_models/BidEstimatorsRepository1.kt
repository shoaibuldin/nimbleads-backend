package com.nimbleads.repository.current_models

import com.nimbleads.model.current_models.BidEstimators
import org.springframework.data.jpa.repository.JpaRepository

interface BidEstimatorsRepository : JpaRepository<BidEstimators?, String?> {
    fun findByNaCustomerIdAndNaTopLevelPortfolioId(
        customerId: Long?,
        naTopLevelPortfolioId: Long?
    ): List<BidEstimators?>?

    fun findByNaCustomerIdAndNaTopLevelPortfolioIdAndModelTypeId(
        customerId: Long?,
        naTopLevelPortfolioId: Long?,
        modelTypeId: Int?
    ): List<BidEstimators?>?
}
