package com.nimbleads.model.billing

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(catalog = "billing_db", name = "payment")
class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0

    @Column(name = "created_at")
    private var createdAt: Timestamp? = null

    @Column(name = "status")
    private var status = 0

    @Column(name = "customer_id")
    private var customerId: Long = 0

    @Column(name = "invoice_id")
    private var invoiceId: Long = 0

    @Column(name = "payment_src")
    private var paymentSource: String? = null

    @Column(name = "external_transaction_number")
    private var externalTransactionNumber: String? = null

    @Column(name = "name_of_payee")
    private var nameofpayee: String? = null

    @Column(name = "email_address")
    private var emailaddress: String? = null

    @Column(name = "notes")
    private var notes: String? = null


    @Transient
    private val dateCreationStr: String? = null
}

