package com.nimbleads.model.amazon


import java.io.Serializable




data class CustomCampaignAsinTargetBidCapsKey(
    val customerId: Long? = null,
    val campaignId: Long? = null,
    val targetId: Long? = null,
    val capSource: Long? = null,
) : Serializable {}
