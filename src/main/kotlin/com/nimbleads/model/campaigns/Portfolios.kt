package com.nimbleads.model.campaigns

import jakarta.persistence.*


@Table(schema = "campaigns", catalog = "campaigns", name = "portfolios")
@Entity
@IdClass(value = PortfoliosKey::class)
class Portfolios {
    @Id
    @Column(name = "customer_id")
    var customerId: Long? = null

    @Id
    @Column(name = "portfolio_id")
    var portfolioId: Long? = null

    var name: String? = null

    @Column(name = "parent_portfolio_id")
    var parentPortfolioId: Long? = null
    var enabled: Boolean? = null

    @Column(name = "enable_reporting")
    var isEnableReporting: Boolean = false
}
