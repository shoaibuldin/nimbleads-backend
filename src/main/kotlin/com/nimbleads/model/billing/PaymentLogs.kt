package com.nimbleads.model.billing

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(catalog = "billing_db", name = "payment_logs")
class PaymentLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0

    @Column(name = "created_at")
    private var createdAt: Timestamp? = null

    @Column(name = "status")
    private var status = false

    @Column(name = "invoice_id")
    private var invoiceId: Long = 0

    @Column(name = "payment_src")
    private var paymentSource: String? = null

    @Column(name = "log")
    private var log: String? = null
}

