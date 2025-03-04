package com.nimbleads.repository.users

import com.nimbleads.model.users.LoginHistory
import org.springframework.data.jpa.repository.JpaRepository

interface LoginHistoryRepository : JpaRepository<LoginHistory?, Long?> {
    fun findTop100ByOrderByLoginDateDesc(): List<LoginHistory?>?
}
