package com.nimbleads.model.config

import jakarta.persistence.*
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy


@Table(schema = "config_db", catalog = "config_db", name = "marketplace_geographies")
@Entity
@IdClass(value = MarketplaceGeoKey::class)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
class MarketplaceGeographies {
    @Id
    @Column(name = "marketplace_id")
    private var marketplaceId: Int? = null

    @Id
    @Column(name = "marketplace_geo_id")
    private var marketplaceGeoId: String? = null
    private val name: String? = null

    @Column(name = "marketplace_geo_timezone")
    private var marketplaceGeoTimezone: String? = null

    @Column(name = "amazon_marketplace_id")
    private var amazonMarketplaceId: String? = null
}
