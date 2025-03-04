package com.nimbleads.model.config

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.sql.Timestamp

@Table(schema = "config_db", catalog = "config_db", name = "event_audit_log")
@Entity
class EventAuditLog {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var id: Long? = null

    @Column(name = "customer_id")
    private var customerId: Long = 0

    @Column(name = "action")
    private var action: String? = null

    @Column(name = "action_type")
    private var actionType: String? = null

    @Column(name = "object")
    private var `object`: String? = null

    @Column(name = "object_id")
    private var objectId: Long? = null

    @Column(name = "user_id")
    private var userId: Long? = null

    @Column(name = "requested_at")
    private var requestedAt: Timestamp? = null
}
