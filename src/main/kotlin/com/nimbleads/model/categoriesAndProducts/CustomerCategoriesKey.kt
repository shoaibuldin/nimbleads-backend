package com.nimbleads.model.categoriesAndProducts

import java.io.Serializable

data class CustomerCategoriesKey  (
    val customerId: Long? = null,
    val customerCategoryId: Long? = null,
) : Serializable {}
