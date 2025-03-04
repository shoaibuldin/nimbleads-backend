package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.NaAmazonLinkedProfiles
import org.springframework.data.jpa.repository.JpaRepository

interface NaAmazonLinkedProfilesRepo : JpaRepository<NaAmazonLinkedProfiles?, Long?> {
    fun findByNaCustomerId(customerId: Long?): List<NaAmazonLinkedProfiles?>?

    fun findByAmazonProfileId(profileId: String?): NaAmazonLinkedProfiles?

    fun findByNaTopLevelPortfolioIdAndNaCustomerId(topLevelPortfolio: Long?, customerId: Long?): NaAmazonLinkedProfiles?

    fun existsByAmazonProfileId(profileId: String?): Boolean

    fun findByAmazonProfileIdAndNaCustomerId(profileId: String?, customerId: Long?): NaAmazonLinkedProfiles?

    fun existsByNaCustomerId(customerId: Long?): Boolean
}
