package com.nimbleads.model.reports


import jakarta.persistence.*


@Entity
@Table(catalog = "reportdb", name = "tracker_product_mapping")
class TrackerProductMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private var id: Long? = null

    @Column(name = "product_id")
    private var productId: String? = null

    @Column(name = "brand_id")
    private var brandId: Long? = null

    @Column(name = "user_id")
    private var userId: Long? = null

    @Column(name = "platform")
    private var platform: String? = null

    @Column(name = "store_name")
    private var storeName: String? = null


    constructor()
    constructor(productId: String?, brandId: Long?, userId: Long?, platform: String?) {
        this.productId = productId
        this.brandId = brandId
        this.userId = userId
        this.platform = platform
    }
}
