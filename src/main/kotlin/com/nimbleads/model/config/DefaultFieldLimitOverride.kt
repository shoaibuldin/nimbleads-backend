package com.nimbleads.model.config

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.sql.Timestamp

@Table(schema = "config_db", catalog = "config_db", name = "field_limits_override")
@Entity
class DefaultFieldLimitOverride {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var id: Long? = null

    @Column(name = "created_at")
    private var createdAt: Timestamp? = null

    @Column(name = "module_name")
    private var moduleName: String? = null

    @Column(name = "field_id")
    private var fieldId: String? = null

    @Column(name = "field_name")
    private var fieldName: String? = null

    @Column(name = "field_type")
    private var fieldType: String? = null

    @Column(name = "change_allowed")
    private var changeAllowed = 0

    @Column(name = "min_value")
    private var minValue: String? = null

    @Column(name = "max_value")
    private var maxValue: String? = null

    @Column(name = "status")
    private var status = 0

    @Column(name = "customer_id")
    private var customerId: Long = 0

    @Column(name = "ui_column")
    private var uiColumn = 0

    @Column(name = "notification_id")
    private var notificationId: Long = 0
}
