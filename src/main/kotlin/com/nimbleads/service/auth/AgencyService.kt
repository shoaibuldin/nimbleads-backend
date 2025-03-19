package com.nimbleads.service.auth

import com.nimbleads.model.config.Agencies
import com.nimbleads.model.config.AgencyUsers
import com.nimbleads.repository.config.AgenciesRepo
import com.nimbleads.repository.config.AgencyUsersRepo
import org.springframework.stereotype.Service

@Service
class AgencyService(
    private val agencyUsersRepo: AgencyUsersRepo,
    private val agencyRepo: AgenciesRepo
) {
    fun findByUser(id: Long?): Agencies {
        val agencyUsers: AgencyUsers? = agencyUsersRepo.findByUserId(id)
        return agencyRepo.findByAgencyId(agencyUsers?.agencyId)!!
    }


}