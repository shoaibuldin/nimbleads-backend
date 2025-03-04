package com.nimbleads.repository.campaigns

import com.nimbleads.model.campaigns.CampaignMarketPlaceAssets
import com.nimbleads.model.campaigns.CampaignMarketPlaceAssetsKey
import org.springframework.data.jpa.repository.JpaRepository

interface CampaignMarketPlaceAssetsRepo : JpaRepository<CampaignMarketPlaceAssets?, CampaignMarketPlaceAssetsKey?> {
    fun findByCampaignId(campaignId: Long?): CampaignMarketPlaceAssets?
}
