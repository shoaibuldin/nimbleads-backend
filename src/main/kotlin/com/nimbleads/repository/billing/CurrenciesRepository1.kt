package com.nimbleads.repository.billing

import com.nimbleads.model.billing.Currencies
import org.springframework.data.jpa.repository.JpaRepository

interface CurrenciesRepository : JpaRepository<Currencies?, Long?> {
    fun findByCurrencyCode(currencyCode: String?): Currencies?

    fun findByStatus(b: Boolean): List<Currencies?>?
}
