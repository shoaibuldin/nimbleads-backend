package com.nimbleads.repository.users

import com.nimbleads.model.users.CustomPermissions
import com.nimbleads.model.users.Permissions
import com.nimbleads.model.users.User
import org.springframework.data.jpa.repository.JpaRepository

interface CustomPermissionRepository : JpaRepository<CustomPermissions?, Long?> {
    fun existsByPermissionsAndUser(permission: Permissions?, user: User?): Boolean

    fun findByUserAndPermissions(user: User?, permission: Permissions?): CustomPermissions?
}
