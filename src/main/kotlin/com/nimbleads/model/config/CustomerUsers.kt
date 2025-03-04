package com.nimbleads.model.config

import jakarta.persistence.*


@Table(schema = "config_db", catalog = "config_db", name = "customer_users")
@Entity
@IdClass(value = CustomerUsersKey::class)
class CustomerUsers {
    @Id
    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Id
    @Column(name = "user_id")
    private var userId: Long? = null
}
