package com.nimbleads.repository.walmart

import com.nimbleads.model.walmart.NaWalmartLinkedProfiles
import org.springframework.data.jpa.repository.JpaRepository

interface NaWalmartLinkedProfilesRepo : JpaRepository<NaWalmartLinkedProfiles?, Long?> {
    fun findByNaCustomerId(customerId: Long?): List<NaWalmartLinkedProfiles?>?

    fun findByWalmartProfileId(profileId: String?): NaWalmartLinkedProfiles?

    fun findByNaTopLevelPortfolioIdAndNaCustomerId(
        topLevelPortfolio: Long?,
        customerId: Long?
    ): NaWalmartLinkedProfiles?

    fun existsByWalmartProfileId(profileId: String?): Boolean

    fun findByWalmartProfileIdAndNaCustomerId(profileId: String?, customerId: Long?): NaWalmartLinkedProfiles?

    fun existsByNaCustomerId(customerId: Long?): Boolean
}
