package com.nimbleads.model.config

import java.io.Serializable

data class CrossRetailerCustomerKey (
    val crossRetailerId: Int? = null,
    val customerId: Int? = null,
) : Serializable {}