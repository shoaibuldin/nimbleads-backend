package com.nimbleads.model.amazon


import java.io.Serializable




data class AsinTargetBidCapsKey(
    val customerId: Long? = null,
    val asin: String? = null,
    val targetAsin: String? = null,
    val capSource: Long? = null,

) : Serializable {}
