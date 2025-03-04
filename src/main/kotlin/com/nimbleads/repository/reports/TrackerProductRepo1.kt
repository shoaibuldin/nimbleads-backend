package com.nimbleads.repository.reports

import com.nimbleads.model.reports.TrackerProduct
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface TrackerProductRepo : JpaRepository<TrackerProduct?, Long?> {
    fun findByUserId(userId: Long?): List<TrackerProduct?>?

    fun findByProductIdAndUserId(productId: String?, userId: Long?): Optional<TrackerProduct?>?
}
