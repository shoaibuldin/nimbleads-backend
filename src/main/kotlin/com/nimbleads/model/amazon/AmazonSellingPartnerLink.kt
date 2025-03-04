package com.nimbleads.model.amazon


import java.sql.Timestamp
import jakarta.persistence.*

@Table(schema = "amazon", catalog = "amazon", name = "amazon_selling_partner_api_link")
@Entity
@IdClass(value = AmazonSellingPartnerLinkKey::class)
class AmazonSellingPartnerLink {
    @Id
    @Column(name = "na_customer_id")
    private val naCustomerId: Long? = null

    @Id
    @Column(name = "created_at")
    private val createdAt: Timestamp? = null

    @Column(name = "state")
    private val state: String? = null

    @Column(name = "mws_auth_token")
    private val mwsAuthToken: String? = null

    @Column(name = "selling_partner_id")
    private val sellingPartnerId: String? = null

    @Column(name = "spapi_oauth_code")
    private val spApiOAuthCode: String? = null

    @Column(name = "refresh_token")
    private val refreshToken: String? = null

    @Column(name = "access_token")
    private val accessToken: String? = null

    @Column(name = "expires_in")
    private val expiresIn = 0

    @Column(name = "active")
    private val active = false
}
