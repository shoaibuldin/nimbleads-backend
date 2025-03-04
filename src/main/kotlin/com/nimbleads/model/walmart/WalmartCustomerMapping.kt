package com.nimbleads.model.walmart

import jakarta.persistence.*

@Entity
@Table(name = "walmart_customer_mapping", schema = "walmart", catalog = "walmart")
class WalmartCustomerMapping {
    @Id
    @Column(name = "na_customer_id")
    private val naCustomerId: Long? = null

    @Column(name = "walmart_advertiser_id")
    private val walmartAdvertiserId: Long? = null
}
