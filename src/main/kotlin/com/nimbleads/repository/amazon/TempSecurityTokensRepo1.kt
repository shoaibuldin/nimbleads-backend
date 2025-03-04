package com.nimbleads.repository.amazon

import com.nimbleads.model.amazon.TempSecurityTokens
import org.springframework.data.jpa.repository.JpaRepository

interface TempSecurityTokensRepo : JpaRepository<TempSecurityTokens?, Long?> {
    fun findTop5ByUserstringContainingOrderByLastUpdatedDesc(userString: String?): List<TempSecurityTokens?>?

    fun findByUserstringContainingOrderByLastUpdatedDesc(userString: String?): TempSecurityTokens?
}
