package com.nimbleads.model.users

import jakarta.persistence.*

@Entity
@Table(name = "permission", schema = "auth_db", catalog = "auth_db")
class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null

    val name: String? = null
    val description: String? = null

    @ManyToMany(mappedBy = "privileges")
    val roles: Collection<Role>? = null
}
