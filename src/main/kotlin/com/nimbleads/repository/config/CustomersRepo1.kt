package com.nimbleads.repository.config

import com.nimbleads.model.config.Customers
import org.springframework.data.jpa.repository.JpaRepository

interface CustomersRepo : JpaRepository<Customers?, Long?> {
    fun findByUserId(id: Long?): Customers?

    fun findByDirect(b: Boolean): List<Customers?>?
}
