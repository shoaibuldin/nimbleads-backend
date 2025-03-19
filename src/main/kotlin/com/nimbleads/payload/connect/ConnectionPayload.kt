package com.nimbleads.payload.connect

import com.nimbleads.model.config.Customers

data class ConnectionPayload(
    val connectionId: Long,
    val connectionName: String,
    val platform: String
)


fun Customers.toConnection()= ConnectionPayload(
    connectionId = this.customerId!!,
    connectionName = this.name!!,
    platform = this.platform!!
)