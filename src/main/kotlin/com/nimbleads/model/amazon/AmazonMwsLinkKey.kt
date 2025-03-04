package com.nimbleads.model.amazon


import java.io.Serializable




data class AmazonMwsLinkKey (
    val naCustomerId: Long? = null,
    val marketplace: String? = null,
) : Serializable {}
