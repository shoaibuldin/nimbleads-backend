package com.nimbleads.model.categoriesAndProducts

import java.io.Serializable

data class CustomerProductMarketplaceKey (
    val customerId: Long? = null,
    val customerProductId: String? = null,
    val marketplaceId: Long? = null,
) : Serializable {}
