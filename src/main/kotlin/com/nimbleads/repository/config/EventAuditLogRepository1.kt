package com.nimbleads.repository.config

import com.nimbleads.model.config.EventAuditLog
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface EventAuditLogRepository : JpaRepository<EventAuditLog?, Long?> {
    fun findAllByObjectAndObjectId(`object`: String?, objectId: Long?): List<EventAuditLog?>?

    fun findAllByCustomerIdOrderByRequestedAtDesc(customerId: Long): List<EventAuditLog?>?

    fun findTop200ByCustomerIdOrderByRequestedAtDesc(customerId: Long): List<EventAuditLog?>?

    fun findAllByCustomerIdOrderByRequestedAtDesc(customerId: Long, pageable: Pageable?): Page<EventAuditLog?>?
}
