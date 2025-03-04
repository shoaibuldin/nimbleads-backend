package com.nimbleads.repository.reports

import com.nimbleads.model.reports.ReportData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ReportDataRepo : JpaRepository<ReportData?, Long?> {
    fun findByDateBetweenOrderByDateDesc(start: Date?, end: Date?): List<ReportData?>?

    fun findByDateBetweenAndCustomerOrderByDateDesc(start: Date?, end: Date?, customerId: Long?): List<ReportData?>?

    @Query(
        value = "SELECT Date,sum(Cost) FROM report_data WHERE customer=?1 AND Date>=?2 group by Date ORDER BY Date ASC",
        nativeQuery = true
    )
    fun findCampaignDailyCost(customerId: Long, date: Date?): List<Array<Any?>?>?
}
