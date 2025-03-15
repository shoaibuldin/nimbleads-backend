package com.nimbleads.service.auth

import com.nimbleads.model.users.CustomPermissions
import com.nimbleads.model.users.Permissions
import com.nimbleads.model.users.Role
import com.nimbleads.model.users.User
import com.nimbleads.repository.users.UserRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

typealias springUser = org.springframework.security.core.userdetails.User

@Service
class CustomUserDetailsService(
    private val userRepository: UserRepository

) : UserDetailsService {
    override fun loadUserByUsername(email: String?): UserDetails =
        userRepository.findByEmail(email)
            ?.mapToUserDetails()
            ?: throw UsernameNotFoundException("Not found!")
}

fun User.mapToUserDetails(): UserDetails =
    springUser.builder()
        .username(email)
        .password(password)
        .disabled(!enabled)
//        .authorities(getAuthorities(roles, customPermissions))
        .build()


private fun getAuthorities(
    roles: Collection<Role>,
    customPermissions: List<CustomPermissions>?
): Collection<GrantedAuthority?> {
    return getGrantedAuthorities(getPrivileges(roles, customPermissions))
}

private fun getGrantedAuthorities(privileges: List<String>): List<GrantedAuthority> {
    val authorities: MutableList<GrantedAuthority> = java.util.ArrayList()
    for (privilege in privileges) {
        authorities.add(SimpleGrantedAuthority(privilege))
    }
    return authorities
}

fun getPrivileges(roles: Collection<Role>, customPermissions: List<CustomPermissions>?): List<String> {
    val privileges: MutableList<String> = ArrayList()
    val collection: MutableList<Permissions> = ArrayList()
    for (role in roles) {
        role.privileges?.let { collection.addAll(it) }
    }
    for (item in collection) {
        item.name?.let { privileges.add(it) }
    }
    if (customPermissions != null) {
        for (customPermission in customPermissions) {
            if (customPermission.status == 1) customPermission.permissions?.name?.let { privileges.add(it) }
            if (customPermission.status == -1) privileges.remove(customPermission.permissions?.name)
        }
    }

    return privileges
}