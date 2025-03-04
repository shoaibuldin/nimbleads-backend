package com.nimbleads.repository.config

import com.nimbleads.model.config.AgencyUsers
import org.springframework.data.jpa.repository.JpaRepository

interface AgencyUsersRepo : JpaRepository<AgencyUsers?, Long?> {
    fun findByAgencyId(agencyId: Long?): List<AgencyUsers?>?

    fun findByUserId(id: Long?): AgencyUsers?
}
