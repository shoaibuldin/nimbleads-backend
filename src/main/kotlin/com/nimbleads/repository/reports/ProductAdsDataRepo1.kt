package com.nimbleads.repository.reports

import com.nimbleads.model.reports.ProductAdsData
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProductAdsDataRepo : JpaRepository<ProductAdsData?, Long?> {
    fun findByDateBetweenOrderByDateDesc(start: Date?, end: Date?): List<ProductAdsData?>?

    fun findByDateBetweenAndCustomerOrderByDateDesc(start: Date?, end: Date?, valueOf: Long?): List<ProductAdsData?>?
}
