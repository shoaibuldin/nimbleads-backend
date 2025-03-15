package com.nimbleads.model.users

import jakarta.persistence.*

@Entity
@Table(name = "customer_permission", schema = "auth_db", catalog = "auth_db")
class CustomPermissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "permissionId")
    val permissions: Permissions? = null

    @ManyToOne
    @JoinColumn(name = "userId")
    val user: User? = null

    // 1 for Add, -1 for Remove
    val status: Int? = null
}
