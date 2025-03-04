package com.nimbleads.model.instacart



import jakarta.persistence.*

@Table(schema = "instacart", catalog = "instacart", name = "instacart_refresh_tokens")
@Entity
class InstaCartRefreshTokens {
    @Id
    @Column(name = "na_customer_id")
    private val naCustomerId: Long? = null

    @Column(name = "refresh_token")
    private val refreshToken: String? = null

    @Column(name = "instacart_state")
    private val instaCartState: String? = null
    private val description: String? = null

    @Column(name = "client_id")
    private val clientId: String? = null

    @Column(name = "client_secret")
    private val clientSecret: String? = null

    @Column(name = "redirect_url")
    private val redirectUri: String? = null
}
