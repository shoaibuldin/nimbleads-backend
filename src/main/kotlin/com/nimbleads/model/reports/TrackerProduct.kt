package com.nimbleads.model.reports


import jakarta.persistence.*

import java.util.*

@Entity
@Table(catalog = "reportdb", name = "tracker_product")
@IdClass(value = TrackerProductKey::class)
class TrackerProduct {
    @Id
    @Column(name = "product_id")
    private var productId: String? = null

    @Column(name = "user_id")
    private var userId: Long? = null

    @Column(name = "product_name")
    private var productName: String? = null

    @Column(name = "platform")
    private var platform: String? = null

    @Column(name = "keywords")
    private var keywords: String? = null

    @Column(name = "store_name")
    private var storeName: String? = null

    @Column(name = "zipcode")
    private var zipcode: String? = null

    @Column(name = "last_searched_timestamp")
    private var lastSearchedTimestamp: Date? = null

    private val active = false
}
