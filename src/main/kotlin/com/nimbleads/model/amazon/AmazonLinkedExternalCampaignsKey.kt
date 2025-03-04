package com.nimbleads.model.amazon


import java.io.Serializable


data class AmazonLinkedExternalCampaignsKey (
    val customerId: Long? = null,
    val campaignId: Long? = null,
    val amazonCampaignId: Long? = null,
) : Serializable {}
