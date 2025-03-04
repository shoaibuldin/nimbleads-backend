package com.nimbleads.model.recommendations


import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp

import java.util.*

@Entity
@IdClass(value = WalmartCampaignUpcKeywordRecommendationsKey::class)
@Table(catalog = "recommendations", name = "walmart_campaign_upc_keyword_recommendations")
class WalmartCampaignUpcKeywordRecommendations {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Id
    @Column(name = "upc")
    private var upc: String? = null

    @Id
    @Column(name = "keyword_text")
    private var keywordText: String? = null

    @Id
    @Column(name = "match_type_id")
    private var matchTypeId: Int? = null

    @Column(name = "include")
    private var include: Boolean? = null

    @Column(name = "last_update_timestamp")
    @CreationTimestamp
    private var lastUpdateTimestamp: Date? = null
}
