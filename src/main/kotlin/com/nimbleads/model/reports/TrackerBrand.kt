package com.nimbleads.model.reports


import jakarta.persistence.*

import jakarta.persistence.Transient
import java.util.*

@Entity
@Table(catalog = "reportdb", name = "tracker_brand")
class TrackerBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private var brandId: Long? = null

    @Column(name = "user_id")
    private var userId: Long? = null

    @Column(name = "brand_name")
    private var brandName: String? = null

    private val active = false
    private val platform: String? = null
    private val zipcode: String? = null

    @Column(name = "last_searched_timestamp")
    private var lastSearchedTimestamp: Date? = null

    private val keywords: String? = null

    @Column(name = "store_name")
    private var storeName: String? = null

    @Transient
    private val products: String? = null
}
