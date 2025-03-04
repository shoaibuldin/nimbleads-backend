package com.nimbleads.model.recommendations


import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp

import java.util.*

@Entity
@IdClass(value = CustomCampaignKeywordRecommendationsKey::class)
@Table(catalog = "recommendations", name = "custom_campaign_keyword_recommendations")
class CustomCampaignKeywordRecommendations {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Id
    @Column(name = "keyword_text")
    private var keywordText: String? = null

    @Id
    @Column(name = "match_type_id")
    private var matchTypeId: Int? = null


    @Column(name = "last_update_timestamp")
    @CreationTimestamp
    private var lastUpdateTimestamp: Date? = null
}
