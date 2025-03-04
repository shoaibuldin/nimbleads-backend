package com.nimbleads.model.recommendations


import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp

import java.util.*

@Entity
@IdClass(value = CustomCampaignAsinTargetAsinRecommendationsKey::class)
@Table(catalog = "recommendations", name = "custom_campaign_target_asin_recommendations")
class CustomCampaignAsinTargetAsinRecommendations {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "target_asin")
    private var targetAsin: String? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Column(name = "last_update_timestamp")
    @CreationTimestamp
    private var lastUpdateTimestamp: Date? = null
}
