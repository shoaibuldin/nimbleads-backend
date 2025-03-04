package com.nimbleads.model.config

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull


@Entity
@Table(schema = "config_db", catalog = "config_db", name = "cross_retailer_users")
@IdClass(value = CrossRetailerUserKey::class)
class CrossRetailerUser {
    @NotNull
    @Column(name = "cross_retailer_id", nullable = false)
    @Id
    private var crossRetailerId: Int? = null

    @NotNull
    @Column(name = "user_id", nullable = false)
    @Id
    private var userId: Int? = null
}