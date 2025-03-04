package com.nimbleads.model.amazon



import java.util.*
import jakarta.persistence.*


@Table(schema = "amazon", catalog = "amazon", name = "temp_security_tokens")
@Entity
class TempSecurityTokens {
    @Id
    @Column(name = "id")
    private val id: Long? = null

    @Column(name = "userstring")
    private val userstring: String? = null

    @Column(name = "token")
    private val token: String? = null

    @Column(name = "last_updated")
    private val lastUpdated: Date? = null
}
