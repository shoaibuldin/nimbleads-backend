package com.nimbleads.repository.config

import com.nimbleads.model.config.MarketplaceGeographies
import org.springframework.data.jpa.repository.JpaRepository

interface MarketplaceGeoRepo : JpaRepository<MarketplaceGeographies?, Long?> {
    fun findByMarketplaceId(markerPlaceId: Int?): List<MarketplaceGeographies?>?
}
