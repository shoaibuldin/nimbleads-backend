package com.nimbleads.model.amazon


import java.io.Serializable




data class CustomCampaignKeywordBidCapsKey (
    val customerId: Long? = null,
    val campaignId: Long? = null,
    val keywordText: String? = null,
    val matchTypeId: Int? = null,
    val capSource: Long? = null,
) : Serializable {}
