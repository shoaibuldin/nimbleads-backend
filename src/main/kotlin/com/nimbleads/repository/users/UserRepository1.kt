package com.nimbleads.repository.users

import com.nimbleads.model.users.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User?, Long?> {
    fun findByEmail(email: String?): User?

    fun findAllByIdIn(userIds: List<Long?>?): List<User?>?

    fun findByEnabled(b: Boolean): List<User?>?

    fun findByRoles_Name(role_admin: String?): List<User?>?
}
