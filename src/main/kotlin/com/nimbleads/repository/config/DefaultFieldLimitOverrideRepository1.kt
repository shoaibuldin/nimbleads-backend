package com.nimbleads.repository.config

import com.nimbleads.model.config.DefaultFieldLimitOverride
import org.springframework.data.jpa.repository.JpaRepository

interface DefaultFieldLimitOverrideRepository : JpaRepository<DefaultFieldLimitOverride?, Long?> {
    fun findAllByCustomerIdAndModuleNameAndStatus(
        customerId: Long,
        moduleName: String?,
        status: Int
    ): List<DefaultFieldLimitOverride?>?

    fun findAllByCustomerIdAndModuleNameAndStatusNotOrderByCreatedAt(
        customerId: Long,
        moduleName: String?,
        status: Int
    ): List<DefaultFieldLimitOverride?>?

    fun findAllByNotificationIdIn(notificationIds: List<Long?>?): List<DefaultFieldLimitOverride?>?
}
