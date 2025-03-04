package com.nimbleads.repository.recommendations

import com.nimbleads.model.recommendations.AsinKeywordRecommendations
import org.springframework.data.jpa.repository.JpaRepository


interface AsinKeywordRecommendationsRepo : JpaRepository<AsinKeywordRecommendations?, Long?> {
    fun existsByAsinAndKeywordText(asin: String?, keywordText: String?): Boolean

    fun findByAsinAndKeywordText(asin: String?, keyword: String?): AsinKeywordRecommendations?
}
