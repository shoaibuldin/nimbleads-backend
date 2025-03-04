package com.nimbleads.repository.reports

import com.nimbleads.model.reports.AmazonListingAnalyzer
import org.springframework.data.jpa.repository.JpaRepository

interface AmazonListingAnalyzerRepo : JpaRepository<AmazonListingAnalyzer?, Long?> {
    fun findByUserIdOrderByAnalyzedDateTimeDesc(id: Long?): List<AmazonListingAnalyzer?>?
}
