package com.nimbleads.model.current_models

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(catalog = "current_models", name = "bid_estimators")
@IdClass(value = BidEstimatorsKey::class)
class BidEstimators : Serializable {
    @Id
    @Column(name = "na_customer_id", nullable = false)
    private var naCustomerId: Long? = null

    @Id
    @Column(name = "na_top_level_portfolio_id", nullable = false)
    private var naTopLevelPortfolioId: Long? = null

    @Id
    @Column(name = "model_type_id", nullable = false)
    private var modelTypeId: Int? = null

    @Id
    @Column(name = "metric_id", nullable = false)
    private var metricId: Int? = null

    @Id
    @Column(name = "method", nullable = false)
    private var method: String? = null

    @Column(name = "evaluation_metric", nullable = false)
    private var evaluationMetric: String? = null

    @Column(name = "score", nullable = false)
    private var score: Double? = null

    @Column(name = "score_recent_data", nullable = false)
    private var scoreRecentData: Double? = null

    @Column(name = "model", nullable = false)
    private lateinit var model: ByteArray

    @Column(name = "model_parameters", nullable = false)
    private var modelParameters: String? = null

    @Column(name = "feature_count", nullable = false)
    private var featureCount: Int? = null

    @Column(name = "recent_instance_feature_counts", nullable = false)
    private var recentInstanceFeatureCounts: String? = null

    @Column(name = "original_features_used", nullable = false)
    private lateinit var originalFeaturesUsed: ByteArray

    @Column(name = "num_training_instances_used", nullable = false)
    private var numTrainingInstancesUsed: Int? = null

    @Column(name = "last_update_timestamp", nullable = false)
    private var lastUpdateTimestamp: Date? = null

    @Column(name = "nimble_ads_campaign_instance_count", nullable = false)
    private var nimbleAdsCampaignInstanceCount: Int? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}
