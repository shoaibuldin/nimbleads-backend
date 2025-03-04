package com.nimbleads.model.config

import java.io.Serializable

data class MarketplaceGeoKey (
    val marketplaceId: Int? = null,
    val marketplaceGeoId: String? = null
) : Serializable {}
