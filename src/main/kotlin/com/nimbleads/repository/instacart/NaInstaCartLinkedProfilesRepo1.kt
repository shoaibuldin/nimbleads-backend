package com.nimbleads.repository.instacart

import com.nimbleads.model.instacart.NaInstaCartLinkedProfiles
import org.springframework.data.jpa.repository.JpaRepository

interface NaInstaCartLinkedProfilesRepo : JpaRepository<NaInstaCartLinkedProfiles?, Long?> {
    fun findByNaCustomerId(customerId: Long?): List<NaInstaCartLinkedProfiles?>?

    fun findByInstaCartProfileId(profileId: String?): NaInstaCartLinkedProfiles?

    fun findByNaTopLevelPortfolioIdAndNaCustomerId(
        topLevelPortfolio: Long?,
        customerId: Long?
    ): NaInstaCartLinkedProfiles?

    fun existsByInstaCartProfileId(profileId: String?): Boolean

    fun findByInstaCartProfileIdAndNaCustomerId(profileId: String?, customerId: Long?): NaInstaCartLinkedProfiles?

    fun existsByNaCustomerId(customerId: Long?): Boolean
}
