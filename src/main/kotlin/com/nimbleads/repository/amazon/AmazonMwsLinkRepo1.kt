package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AmazonMwsLink
import org.springframework.data.jpa.repository.JpaRepository

interface AmazonMwsLinkRepo : JpaRepository<AmazonMwsLink?, Long?> {
    fun findByNaCustomerIdAndMarketplace(customerId: Long?, marketplace: String?): AmazonMwsLink?

    fun findByNaCustomerId(customerId: Long?): AmazonMwsLink?

    fun countByNaCustomerId(customerId: Long?): Long?
}
