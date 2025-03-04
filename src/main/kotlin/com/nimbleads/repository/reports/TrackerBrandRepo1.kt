package com.nimbleads.repository.reports

import com.nimbleads.model.reports.TrackerBrand
import org.springframework.data.jpa.repository.JpaRepository

interface TrackerBrandRepo : JpaRepository<TrackerBrand?, Long?> {
    fun findByUserId(userId: Long?): List<TrackerBrand?>?
}
