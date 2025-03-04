package com.nimbleads.repository.config

import com.nimbleads.model.config.CrossRetailerUser
import com.nimbleads.model.config.CrossRetailerUserKey
import org.springframework.data.jpa.repository.JpaRepository

interface CrossRetailerUserRepo : JpaRepository<CrossRetailerUser?, CrossRetailerUserKey?> {
    fun findByUserId(userId: Int?): List<CrossRetailerUser?>?
}
