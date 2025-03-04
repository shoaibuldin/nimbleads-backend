package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.AmazonProductsWithCategoriesTemp
import org.springframework.data.jpa.repository.JpaRepository

interface AmazonProductsWithCategoriesTempRepo : JpaRepository<AmazonProductsWithCategoriesTemp?, Long?> {
    fun findByCustomerIdAndProfileId(customerId: Long?, profileId: String?): List<AmazonProductsWithCategoriesTemp?>?
}
