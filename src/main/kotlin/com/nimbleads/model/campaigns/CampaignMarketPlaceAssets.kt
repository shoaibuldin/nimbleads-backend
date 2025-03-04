package com.nimbleads.model.campaigns

import jakarta.persistence.*


@Table(schema = "campaigns", catalog = "campaigns", name = "campaign_marketplace_assets")
@Entity
@IdClass(value = CampaignMarketPlaceAssetsKey::class)
class CampaignMarketPlaceAssets {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "campaign_id")
    private var campaignId: Long? = null

    @Id
    @Column(name = "marketplace_id")
    private var marketplaceId: Long? = null

    @Column(name = "marketplace_brand_entity_id")
    private var marketplaceBrandEntityId: String? = null

    @Column(name = "marketplace_media_asset_id")
    private var marketplaceMediaAssetId: String? = null

    @Column(name = "headline")
    private var headline: String? = null

    @Column(name = "landing_page")
    private var landingPage: String? = null

    @Column(name = "brand_logo_asset_id")
    private var brandLogoAssetID: String? = null

    @Column(name = "other_logo_asset_id")
    private var otherLogoAssetID: String? = null

    @Column(name = "brand_name")
    private var brandName: String? = null

    @Column(name = "landing_page_selection")
    private var landingPageSelection: String? = null

    @Column(name = "video_asset_ids")
    private var videoAssetIds: String? = null

    @Column(name = "store_sub_pages")
    private var storeSubPages: String? = null

    @Column(name = "page_title")
    private var pageTitle: String? = null

    @Column(name = "page_title_asin")
    private var pageTitleAsin: String? = null

    // SD Campaign
    @Column(name = "cost_type")
    private var costType: String? = null

    @Column(name = "bid_optimization")
    var bidOptimization: String? = null

    @Column(name = "creative_type")
    var creativeType: String? = null

    @Column(name = "brand_crop_size")
    var brandCropSize: String? = null

    @Column(name = "custom_crop_size")
    var customCropSize: String? = null

    @Column(name = "custom_image_asset_id")
    var customImageAssetId: String? = null

    @Lob
    @Column(name = "brand_logo")
    private lateinit var brandLogo: ByteArray
}
