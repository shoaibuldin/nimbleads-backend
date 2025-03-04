package com.nimbleads.repository.reports

import com.nimbleads.model.reports.TrackerProductMapping
import org.springframework.data.jpa.repository.JpaRepository

interface TrackerProductMappingRepo : JpaRepository<TrackerProductMapping?, Long?> {
    fun findByBrandId(brandId: Long?): List<TrackerProductMapping?>?
}
