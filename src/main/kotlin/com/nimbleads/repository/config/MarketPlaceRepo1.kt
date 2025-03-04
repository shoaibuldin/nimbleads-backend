package com.nimbleads.repository.config

import com.nimbleads.model.config.Marketplaces
import org.springframework.data.jpa.repository.JpaRepository

interface MarketPlaceRepo : JpaRepository<Marketplaces?, Long?>
