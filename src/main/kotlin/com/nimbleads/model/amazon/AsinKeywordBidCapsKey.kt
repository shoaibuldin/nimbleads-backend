package com.nimbleads.model.amazon


import java.io.Serializable




data class AsinKeywordBidCapsKey (
    val customerId: Long? = null,
    val asin: String? = null,
    val keywordText: String? = null,
    val matchTypeId: Long? = null,
    val capSource: Long? = null,
) : Serializable {}
