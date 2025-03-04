package com.nimbleads.repository.reports

import com.nimbleads.model.reports.AgencyProfileGroups
import org.springframework.data.jpa.repository.JpaRepository

interface AgencyProfileGroupsRepo : JpaRepository<AgencyProfileGroups?, Long?> {
    override fun findAll(): List<AgencyProfileGroups?>
}
