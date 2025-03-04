package com.nimbleads.model.users

import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "login_history", schema = "auth_db", catalog = "auth_db")
class LoginHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    private val username: String? = null
    private val ip: String? = null
    private val browser: String? = null

    @Column(name = "login_date")
    private var loginDate: Date? = null
}
