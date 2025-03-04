package com.nimbleads.repository.users

import com.nimbleads.model.users.Role
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*


interface RoleRepository : JpaRepository<Role?, Long?> {
    fun findByName(roleName: String?): Optional<Role?>?


    fun findByNameIn(roles: List<String?>?): List<Role?>?
}
