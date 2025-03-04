package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AmazonMediaAssets
import org.springframework.data.jpa.repository.JpaRepository

interface AmazonMediaAssetsRepo : JpaRepository<AmazonMediaAssets?, Long?> {
    fun findByCustomerIdAndProfileId(customerId: Long?, profileid: String?): List<AmazonMediaAssets?>?

    fun findByCustomerIdAndProfileIdAndAsin(
        customerId: Long?,
        profileId: String?,
        asin: String?
    ): List<AmazonMediaAssets?>?

    fun findByStatus(processing: String?): List<AmazonMediaAssets?>?

    fun findByCustomerIdAndProfileIdAndStatus(
        customerId: Long?,
        profileid: String?,
        available: String?
    ): List<AmazonMediaAssets?>?
}
