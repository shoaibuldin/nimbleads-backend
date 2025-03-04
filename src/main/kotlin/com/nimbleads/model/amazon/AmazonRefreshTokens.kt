package com.nimbleads.model.amazon


import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "amazon_refresh_tokens")
@Entity
class AmazonRefreshTokens {
    @Id
    @Column(name = "na_customer_id")
    private val naCustomerId: Long? = null

    @Column(name = "refresh_token")
    private val refreshToken: String? = null

    @Column(name = "amazon_state")
    private val amazonState: String? = null
    private val description: String? = null
}
