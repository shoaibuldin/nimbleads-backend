package com.nimbleads.repository.config

import com.nimbleads.model.config.DefaultFieldLimit
import org.springframework.data.jpa.repository.JpaRepository

interface DefaultFieldLimitRepository : JpaRepository<DefaultFieldLimit?, Long?> {
    fun findAllByModuleNameAndStatus(moduleName: String?, status: Int): List<DefaultFieldLimit?>?
}
