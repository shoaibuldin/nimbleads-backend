package com.nimbleads.model.config

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull


@Entity
@Table(schema = "config_db", catalog = "config_db", name = "cross_retailer_customers")
@IdClass(value = CrossRetailerCustomerKey::class)
class CrossRetailerCustomer {
    @NotNull
    @Column(name = "cross_retailer_id", nullable = false)
    @Id
    private var crossRetailerId: Int? = null

    @NotNull
    @Column(name = "customer_id", nullable = false)
    @Id
    private var customerId: Int? = null
}