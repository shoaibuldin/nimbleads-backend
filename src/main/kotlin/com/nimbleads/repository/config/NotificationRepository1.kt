package com.nimbleads.repository.config

import com.nimbleads.model.config.Notification
import org.springframework.data.jpa.repository.JpaRepository

interface NotificationRepository : JpaRepository<Notification?, Long?> {
    fun findTopTenByNoteForUserOrderByCreatedAtDesc(userId: Long): List<Notification?>?
}
