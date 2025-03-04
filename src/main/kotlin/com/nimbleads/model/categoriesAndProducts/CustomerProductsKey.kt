package com.nimbleads.model.categoriesAndProducts

import java.io.Serializable

data class CustomerProductsKey  (
    val customerId: Long? = null,
    val customerProductId: String? = null,
)
    : Serializable {}