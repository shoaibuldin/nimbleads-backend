package com.nimbleads.model.users

import jakarta.persistence.*

@Entity
@Table(name = "permission", schema = "auth_db", catalog = "auth_db")
class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    private val name: String? = null
    private val description: String? = null

    @ManyToMany(mappedBy = "privileges")
    private val roles: Collection<Role>? = null
}
