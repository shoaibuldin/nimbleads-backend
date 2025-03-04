package com.nimbleads.repository.recommendations

import com.nimbleads.model.recommendations.AsinTargetAsinRecommendations
import org.springframework.data.jpa.repository.JpaRepository


interface AsinTargetRecommendationsRepo : JpaRepository<AsinTargetAsinRecommendations?, Long?> {
    fun existsByAsinAndTargetAsin(asin: String?, targetAsin: String?): Boolean

    fun findByAsinAndTargetAsin(asin: String?, targetAsin: String?): AsinTargetAsinRecommendations?
}
