package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AmazonSellingPartnerLink
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AmazonSellingPartnerLinkRepository : JpaRepository<AmazonSellingPartnerLink?, Long?> {
    fun findOneByState(state: String?): AmazonSellingPartnerLink?

    fun findAllByNaCustomerId(customerId: Long): List<AmazonSellingPartnerLink?>?
}
