package com.nimbleads.model.recommendations


import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp

import java.util.*

@Entity
@IdClass(value = AsinTargetAsinRecommendationsKey::class)
@Table(catalog = "recommendations", name = "asin_target_asin_recommendations")
class AsinTargetAsinRecommendations {
    @Id
    private val asin: String? = null

    @Id
    @Column(name = "target_asin")
    private var targetAsin: String? = null
    private val include: String? = null

    @Column(name = "last_update_timestamp")
    @CreationTimestamp
    private var lastUpdateTimestamp: Date? = null
}
