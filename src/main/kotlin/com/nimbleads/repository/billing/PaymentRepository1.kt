package com.nimbleads.repository.billing

import com.nimbleads.model.billing.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment?, Long?> {
    fun findByInvoiceId(invoiceId: Long?): Payment?
}
