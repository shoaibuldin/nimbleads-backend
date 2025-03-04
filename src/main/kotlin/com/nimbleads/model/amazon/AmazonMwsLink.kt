package com.nimbleads.model.amazon


import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "amazon_mws_link")
@Entity
@IdClass(value = AmazonMwsLinkKey::class)
class AmazonMwsLink {
    @Id
    @Column(name = "na_customer_id")
    private val naCustomerId: Long? = null

    @Column(name = "merchant_id")
    private val merchantId: String? = null

    @Column(name = "mws_auth_token")
    private val mwsAuthToken: String? = null

    @Id
    @Column(name = "marketplace")
    private val marketplace: String? = null

    private val zone: String? = null
}
