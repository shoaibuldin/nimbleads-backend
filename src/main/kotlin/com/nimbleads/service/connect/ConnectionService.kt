package com.nimbleads.service.connect

import com.nimbleads.model.config.Agencies
import com.nimbleads.model.users.User
import com.nimbleads.payload.connect.ConnectionPayload
import com.nimbleads.payload.connect.toConnection
import com.nimbleads.repository.config.CustomersRepo
import com.nimbleads.service.auth.AgencyService
import com.nimbleads.service.auth.AuthenticationService
import org.springframework.stereotype.Service

@Service
class ConnectionService(
    private val authService: AuthenticationService,
    private val customerRepo: CustomersRepo,
    private val agencyService: AgencyService
) {

    fun getLoggedInUserConnections(platform: String?): List<ConnectionPayload?>? {
        val user: User = authService.getLoggedInUser()!!
        val isAdmin: Boolean = authService.isAdmin(user)
        val isAgency: Boolean = authService.isAgency(user)
        val isCustomer: Boolean = authService.isCustomer(user)
        var customers: List<ConnectionPayload?>? = null
        if (isAdmin) customers = getAllConnections()
        else if (isAgency) {
            val agencies: Agencies = agencyService.findByUser(user.id)
            customers = getAllConnectionsByAgency(agencies)
        } else if (isCustomer) {
            customers = listOf(customerRepo.findByUserId(user.id).let { it?.toConnection()!! })
        }

        platform?.let {
            customers = customers?.filter { it!!.platform == platform }
        }

        return customers
    }


    fun getAllConnections(): List<ConnectionPayload> {
        val customers = customerRepo.findAll().map { it?.toConnection()!! }
        return customers
    }

    fun getAllConnectionsByAgency(agencies: Agencies): List<ConnectionPayload> {
        val connections = agencies.customers.map { it.toConnection() }
        return connections
    }


}