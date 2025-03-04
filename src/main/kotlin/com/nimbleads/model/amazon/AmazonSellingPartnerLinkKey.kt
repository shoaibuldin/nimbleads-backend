package com.nimbleads.model.amazon

import java.io.Serializable
import java.sql.Timestamp

data class AmazonSellingPartnerLinkKey (
    val naCustomerId: Long? = null,
    val createdAt: Timestamp? = null
) : Serializable {}
