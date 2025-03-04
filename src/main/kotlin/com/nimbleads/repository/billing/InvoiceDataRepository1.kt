package com.nimbleads.repository.billing

import com.nimbleads.model.billing.InvoiceData
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceDataRepository : JpaRepository<InvoiceData?, Long?> {
    fun findByCustomerId(customerId: Long?): List<InvoiceData?>?

    fun findByCustomerIdOrderByDueDateDesc(customerId: Long?): List<InvoiceData?>?

    fun findTopByCustomerIdOrderByBillingEndDateDesc(customerId: Long?): InvoiceData?

    fun findByCustomerIdAndInvoiceNumber(customerId: Long?, invoiceId: Long?): InvoiceData?

    fun findTopByCustomerIdAndStatusOrderByDueDateDesc(customerId: Long?, i: Int): InvoiceData?

    fun findByCustomerIdOrderByCreatedAtDesc(customerId: Long?): List<InvoiceData?>?

    fun findByStatus(i: Int): List<InvoiceData?>?
}
