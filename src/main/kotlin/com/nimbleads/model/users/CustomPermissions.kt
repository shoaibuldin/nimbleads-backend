package com.nimbleads.model.users

import jakarta.persistence.*

@Entity
@Table(name = "customer_permission", schema = "auth_db", catalog = "auth_db")
class CustomPermissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "permissionId")
    private val permissions: Permissions? = null

    @ManyToOne
    @JoinColumn(name = "userId")
    private val user: User? = null

    // 1 for Add, -1 for Remove
    private val status: Int? = null
}
