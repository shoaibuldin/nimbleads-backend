package com.nimbleads.repository.reports

import com.nimbleads.model.reports.KeywordData
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface KeywordDataRepo : JpaRepository<KeywordData?, Long?> {
    fun findByDateBetweenOrderByDateDesc(start: Date?, end: Date?): List<KeywordData?>?

    fun findByDateBetweenAndCustomerOrderByDateDesc(start: Date?, end: Date?, valueOf: Long?): List<KeywordData?>?

    fun findByDateBetweenAndCustomerAndCampaignTargetingTypeOrderByDateDesc(
        start: Date?,
        end: Date?,
        valueOf: Long?,
        campaignTarget: String?
    ): List<KeywordData?>?

    fun findByDateBetweenAndCampaignTargetingTypeOrderByDateDesc(
        start: Date?,
        end: Date?,
        campaignTargeting: String?
    ): List<KeywordData?>?
}
