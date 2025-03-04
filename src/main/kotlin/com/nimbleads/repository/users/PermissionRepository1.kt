package com.nimbleads.repository.users

import com.nimbleads.model.users.Permissions
import org.springframework.data.jpa.repository.JpaRepository

interface PermissionRepository : JpaRepository<Permissions?, Long?>
