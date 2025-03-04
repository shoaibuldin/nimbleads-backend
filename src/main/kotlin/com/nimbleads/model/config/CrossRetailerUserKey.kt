package com.nimbleads.model.config

import java.io.Serializable

data class CrossRetailerUserKey  (
    val crossRetailerId: Int? = null,
    val userId: Int? = null,
) : Serializable {}