package com.nimbleads.model.campaigns


import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

import java.io.Serializable
import java.util.*

@Table(schema = "campaigns", catalog = "campaigns", name = "portfolio_constraints")
@Entity
class PortfolioConstraints : Serializable {
    @Id
    @Column(name = "rec_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var recId: Long? = null

    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Column(name = "portfolio_id")
    private var portfolioId: Long? = null

    @Column(name = "metric_id")
    private var metricId: Long? = null

    @Column(name = "metric_goal_value")
    private var metricGoalValue: Double? = null

    @Column(name = "min_budget")
    private var minBudget: Double? = null

    @Column(name = "max_budget")
    private var maxBudget: Double? = null

    @Column(name = "start_date")
    private var startDate: Date? = null

    @Column(name = "budget_computation_performance_transformation_function_id")
    private var budgetComputationPerformanceTransformationFunctionId: Long? = null

    @Column(name = "bid_computation_performance_transformation_function_id")
    private var bidComputationPerformanceTransformationFunctionId: Long? = null

    @Column(name = "min_allowed_daily_budget_change")
    private var minAllowedDailyBudgetChange: Double? = null

    @Column(name = "max_allowed_daily_budget_change")
    private var maxAllowedDailyBudgetChange: Double? = null

    @Column(name = "max_allowed_scaling_factor")
    private var maxAllowedScalingFactor: Double? = null

    @Column(name = "default_scaling_factor")
    private var defaultScalingFactor: Double? = null

    @Column(name = "min_nimble_ads_instances_in_model_for_full_bidding")
    private var minNimbleAdsInstancesInModelForFullBidding: Long? = null

    @Column(name = "bid_cap_ad_groups_low_na_instances")
    private var bidCapAdGroupsLowNaInstances: Double? = null

    @Column(name = "bid_cap_keywords_low_na_instances")
    private var bidCapKeywordsLowNaInstances: Double? = null

    @Column(name = "bid_cap_target_asins_low_na_instances")
    private var bidCapTargetAsinsLowNaInstances: Double? = null

    @Column(name = "min_bid_cap_ad_groups_low_na_instances")
    private var minBidCapAdGroupsLowNaInstances: Double? = null

    @Column(name = "min_bid_cap_keywords_low_na_instances")
    private var minBidCapKeywordsLowNaInstances: Double? = null

    @Column(name = "min_bid_cap_target_asins_low_na_instances")
    private var minBidCapTargetAsinsLowNaInstances: Double? = null

    @Column(name = "min_cpc_goal")
    private var minCpcGoal: Double? = null

    @Column(name = "default_cpc_goal")
    private var defaultCpcGoal: Double? = null

    @Column(name = "max_cpc_goal")
    private var maxCpcGoal: Double? = null

    @Column(name = "min_performance_difference_to_change_cpc_goal")
    private var minPerformanceDifferenceToChangeCpcGoal: Double? = null

    @Column(name = "min_click_volume_to_change_cpc_goal")
    private var minClickVolumeToChangeCpcGoal: Double? = null

    @Column(name = "max_allowed_diff_cpc_and_current_cpc_goal_to_change_cpc_goal")
    private var maxAllowedDiffCpcAndCurrentCpcGoalToChangeCpcGoal: Double? = null

    @Column(name = "max_allowed_daily_cpc_goal_change_percentage")
    private var maxAllowedDailyCpcGoalChangePercentage: Double? = null

    @Column(name = "include_second_keyword_training_instance_with_query_text")
    private var includeSecondKeywordTrainingInstanceWithQueryText: Boolean? = null

    @Column(name = "max_allowed_bid")
    private var maxAllowedBid: Double? = null

    @Column(name = "min_allowed_amazon_tos_adjustment")
    private var minAllowedAmazonTosAdjustment: Double? = null

    @Column(name = "max_allowed_amazon_tos_adjustment")
    private var maxAllowedAmazonTosAdjustment: Double? = null

    @Column(name = "max_allowed_amazon_dp_adjustment")
    private var maxAllowedAmazonDpAdjustment: Double? = null

    @Column(name = "restrict_model_training_to_same_sku_conversions")
    private var restrictModelTrainingToSameSkuConversions: Boolean? = null

    @Column(name = "max_allowed_amazon_budget_overallocation_factor")
    private var maxAllowedAmazonBudgetOverallocationFactor: Double? = null

    @Column(name = "max_allowed_amazon_budget_overallocation_factor_oos_portfolios")
    private var maxAllowedAmazonBudgetOverallocationFactorOosPortfolios: Double? = null

    @Column(name = "use_campaign_scaling_factors")
    private var useCampaignScalingFactors: Boolean? = null

    @Column(name = "max_allowed_roas_model_bid_percentage_adjustment")
    private var maxAllowedRoasModelBidPercentageAdjustment: Double? = null

    @Column(name = "min_daily_budget")
    private var minDailyBudget: Double? = null

    @Column(name = "max_daily_budget")
    private var maxDailyBudget: Double? = null

    @Column(name = "max_allowed_additional_carryover_percentage")
    private var maxAllowedAdditionalCarryoverPercentage: Double? = null

    @Column(name = "max_allowed_amazon_auto_campaign_share")
    private var maxAllowedAmazonAutoCampaignShare: Double? = null

    @Column(name = "amazon_auto_campaign_products_default_bid")
    private var amazonAutoCampaignProductsDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_products_default_bid")
    private var amazonManualCampaignProductsDefaultBid: Double? = null

    @Column(name = "amazon_auto_campaign_keywords_default_bid")
    private var amazonAutoCampaignKeywordsDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_keywords_em_default_bid")
    private var amazonManualCampaignKeywordsEmDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_keywords_pm_default_bid")
    private var amazonManualCampaignKeywordsPmDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_keywords_bm_default_bid")
    private var amazonManualCampaignKeywordsBmDefaultBid: Double? = null

    @Column(name = "time_based_bid_overrides")
    private var timeBasedBidOverrides: String? = null

    @Column(name = "svp_min_conversions_30_day")
    private var svpConversions30Day = 0

    @Column(name = "svp_policy_30_day")
    private var svpPolicy30Day = 0

    @Column(name = "svp_min_conversions_5_day")
    private var svpConversions5Day = 0

    @Column(name = "svp_policy_5_day")
    private var svpPolicy5Day = 0

    @Column(name = "auto_add_amazon_keyword_recommendations")
    private var autoAddAmazonKeywordRecommendations = false

    @Column(name = "auto_add_amazon_target_asin_recommendations")
    private var autoAddAmazonTargetAsinRecommendations = false

    @Column(name = "use_gbt_models_in_bidding")
    private var useGbtModelsInBidding = false

    @Column(name = "use_svr_models_in_bidding")
    private var useSvrModelsInBidding = false

    @Column(name = "ntb_models_weight")
    private var ntbModelsWeight: Double? = null

}
