package com.nimbleads.model.campaigns

import java.sql.Timestamp
import jakarta.persistence.*

@Table(schema = "campaigns", catalog = "campaigns", name = "porfolio_group")
@Entity
class PortfolioGroup {
    @Id
    @Column(name = "group_id")
    private val groupId: Long = 0

    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Column(name = "group_name")
    private val groupName: String? = null

    @Column(name = "marketplace_id")
    private val marketplaceId = 0

    @Column(name = "created_at")
    private val createdAt: Timestamp? = null
}