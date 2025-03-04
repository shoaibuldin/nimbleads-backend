package com.nimbleads.model.campaigns

import jakarta.persistence.*
import java.util.*

@Table(schema = "campaigns", catalog = "campaigns", name = "campaign_constraints")
@Entity
class CampaignConstraints {
    @Id
    @Column(name = "rec_id")
    private val recId: Long? = null

    @Column(name = "customer_id")
    private val customerId: Long? = null

    @Column(name = "campaign_id")
    private val campaignId: Long? = null

    @Column(name = "min_daily_budget")
    private val minDailyBudget: Double? = null

    @Column(name = "max_daily_budget")
    private val maxDailyBudget: Double? = null

    @Column(name = "min_cpc_goal")
    private val minCpcGoal: Double? = null

    @Column(name = "max_cpc_goal")
    private val maxCpcGoal: Double? = null

    @Column(name = "metric_goal_value")
    private val metricGoalValue: Double? = null

    @Column(name = "min_allowed_bid")
    private val minAllowedBid: Double? = null

    @Column(name = "max_allowed_bid")
    private val maxAllowedBid: Double? = null

    @Column(name = "start_date")
    private val startDate: Date? = null

    @Column(name = "amazon_auto_campaign_products_default_bid")
    private val amazonAutoCampaignProductsDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_products_default_bid")
    private val amazonManualCampaignProductsDefaultBid: Double? = null

    @Column(name = "amazon_auto_campaign_keywords_default_bid")
    private val amazonAutoCampaignKeywordsDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_keywords_em_default_bid")
    private val amazonManualCampaignKeywordsEmDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_keywords_pm_default_bid")
    private val amazonManualCampaignKeywordsPmDefaultBid: Double? = null

    @Column(name = "amazon_manual_campaign_keywords_bm_default_bid")
    private val amazonManualCampaignKeywordsBmDefaultBid: Double? = null

    @Column(name = "max_allowed_amazon_auto_campaign_share")
    private val maxAllowedAmazonAutoCampaignShare: Double? = null

    @Column(name = "min_allowed_amazon_tos_adjustment")
    private val minAllowedAmazonTosAdjustment: Double? = null

    @Column(name = "max_allowed_amazon_tos_adjustment")
    private val maxAllowedAmazonTosAdjustment: Double? = null

    }
