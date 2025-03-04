package com.nimbleads.model.users

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.util.*


@Entity
@Table(
    name = "users_otp", schema = "auth_db", catalog = "auth_db", uniqueConstraints = [UniqueConstraint(
        columnNames = ["email", "otp"
        ]
    )]
)
class UserOTP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    private val email: String? = null
    private val otp: String? = null

    @CreatedDate
    private val createdDate: Date? = null
}
