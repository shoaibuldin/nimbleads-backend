package com.nimbleads.repository.reports

import com.nimbleads.model.reports.TrackerZipCode
import org.springframework.data.jpa.repository.JpaRepository

interface TrackerZipCodeRepo : JpaRepository<TrackerZipCode?, Long?>
