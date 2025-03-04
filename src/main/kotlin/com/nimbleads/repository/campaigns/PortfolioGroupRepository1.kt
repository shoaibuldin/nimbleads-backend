package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.PortfolioGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PortfolioGroupRepository : JpaRepository<PortfolioGroup?, Long?> {
    fun findAllByCustomerId(customerId: Long): List<PortfolioGroup?>?
}
