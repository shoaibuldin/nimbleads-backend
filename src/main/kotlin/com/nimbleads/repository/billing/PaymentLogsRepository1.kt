package com.nimbleads.repository.billing

import com.nimbleads.model.billing.PaymentLogs
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentLogsRepository : JpaRepository<PaymentLogs?, Long?>
