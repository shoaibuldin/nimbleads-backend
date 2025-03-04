package com.nimbleads.repository.config

import com.nimbleads.model.config.CrossRetailer
import org.springframework.data.jpa.repository.JpaRepository

interface CrossRetailerRepo : JpaRepository<CrossRetailer?, Int?>
