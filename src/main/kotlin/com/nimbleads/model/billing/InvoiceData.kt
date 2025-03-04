package com.nimbleads.model.billing

import jakarta.persistence.*
import java.sql.Timestamp

@Entity

@Table(catalog = "billing_db", name = "invoice_data")
class InvoiceData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0

    @Column(name = "created_at")
    private var createdAt: Timestamp? = null

    @Column(name = "status")
    private var status = 0

    @Column(name = "description")
    private var description: String? = null

    @Column(name = "currency")
    private var currency: String? = null

    @Column(name = "currency_code")
    private var currencyCode: String? = null

    @Column(name = "amount")
    private var amount = 0f

    @Column(name = "discount")
    private var discount = 0f

    @Column(name = "due_date")
    private var dueDate: Timestamp? = null

    @Column(name = "customer_id")
    private var customerId: Long = 0

    @Column(name = "invoice_number")
    private var invoiceNumber: Long? = null

    @Column(name = "billing_start_date")
    private var billingStartDate: Timestamp? = null

    @Column(name = "billing_end_date")
    private var billingEndDate: Timestamp? = null

    @Transient
    private val startDate: String? = null

    @Transient
    private val endDate: String? = null

    @Transient
    private val dueDateStr: String? = null
}
