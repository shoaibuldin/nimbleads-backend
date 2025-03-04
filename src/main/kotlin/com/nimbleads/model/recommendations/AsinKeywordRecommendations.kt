package com.nimbleads.model.recommendations


import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp

import java.util.*

@Entity
@IdClass(value = AsinKeywordRecommendationsKey::class)
@Table(catalog = "recommendations", name = "asin_keyword_recommendations")
class AsinKeywordRecommendations {
    @Id
    private val asin: String? = null

    @Column(name = "keyword_text")
    @Id
    private var keywordText: String? = null
    private val include: String? = null

    @Column(name = "last_update_timestamp")
    @CreationTimestamp
    private var lastUpdateTimestamp: Date? = null
}
