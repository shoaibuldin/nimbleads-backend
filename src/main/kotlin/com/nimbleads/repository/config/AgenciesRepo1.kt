package com.nimbleads.repository.config

import com.nimbleads.model.config.Agencies
import org.springframework.data.jpa.repository.JpaRepository

interface AgenciesRepo : JpaRepository<Agencies?, Long?> {
    //Agencies findByUser(User user);
    fun findByUserId(user: Long?): Agencies?

    fun findByAgencyId(agencyId: Long?): Agencies?
}
