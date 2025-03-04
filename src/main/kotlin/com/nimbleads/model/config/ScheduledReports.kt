package com.nimbleads.model.config

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

import java.sql.Date
import java.sql.Timestamp

@Table(schema = "config_db", catalog = "config_db", name = "scheduled_reports")
@Entity
class ScheduledReports {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var id: Long? = null

    @Column(name = "customer_id")
    private var customerId: Long? = null

    @Column(name = "profile_id")
    private var profileId: Long? = null

    private val platform = 0

    private val report = 0

    private val frequency = 0

    private val duration = 0

    private val emails: String? = null

    private val columns: String? = null

    private val status = 0

    @Column(name = "created_at")
    private var createdAt: Timestamp? = null

//    @Column(name = "request_type")
//    private var requestType: ReportRequestTypeEnum? = null

    @Column(name = "start_date")
    private var startDate: Date? = null

    @Column(name = "end_date")
    private var endDate: Date? = null

    private val aggregation: String? = null
}
