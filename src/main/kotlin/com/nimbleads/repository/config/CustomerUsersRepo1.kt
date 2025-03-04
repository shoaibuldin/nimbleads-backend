package com.nimbleads.repository.config

import com.nimbleads.model.config.CustomerUsers
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerUsersRepo : JpaRepository<CustomerUsers?, Long?> {
    fun findByCustomerId(customerId: Long?): List<CustomerUsers?>?

    fun findByUserId(id: Long?): CustomerUsers?
}
