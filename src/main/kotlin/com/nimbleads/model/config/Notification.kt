package com.nimbleads.model.config

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.sql.Timestamp

@Table(schema = "config_db", catalog = "config_db", name = "notifications")
@Entity
class Notification {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var id: Long? = null

    @Column(name = "created_at")
    private var createdAt: Timestamp? = null

    @Column(name = "note_by_user")
    private var noteByUser: Long = 0

    @Column(name = "note_for_user")
    private var noteForUser: Long = 0

    @Column(name = "customer_name")
    private var customerName: String? = null

    @Column(name = "note_description")
    private var noteDescription: String? = null

    @Column(name = "note_type")
    private var noteType: String? = null

    @Column(name = "is_read")
    private var isRead = false

    @Column(name = "object_id")
    private var objectId: Long = 0
}
