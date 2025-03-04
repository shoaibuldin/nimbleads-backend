package com.nimbleads.repository.reports

import com.nimbleads.model.reports.KeywordTermMapping
import org.springframework.data.jpa.repository.JpaRepository

interface KeywordTermMappingRepo : JpaRepository<KeywordTermMapping?, Long?> {
    fun findByCustomerId(customerId: Long?): List<KeywordTermMapping?>?
}
