package com.nimbleads.repository.config

import com.nimbleads.model.config.CrossRetailerCustomer
import com.nimbleads.model.config.CrossRetailerCustomerKey
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface CrossRetailerCustomerRepo : JpaRepository<CrossRetailerCustomer?, CrossRetailerCustomerKey?> {
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM cross_retailer_customers WHERE cross_retailer_id = :id", nativeQuery = true)
    fun deleteByCrossRetailerId(@Param("id") id: Int?)
}
