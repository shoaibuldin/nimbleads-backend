package com.nimbleads.repository.walmart

import com.nimbleads.model.walmart.WalmartCustomerMapping
import org.springframework.data.jpa.repository.JpaRepository


interface WalmartCustomerMappingRepository : JpaRepository<WalmartCustomerMapping?, Long?>
