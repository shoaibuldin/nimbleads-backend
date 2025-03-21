package com.nimbleads.model.config

import jakarta.persistence.*


@Table(schema = "config_db", catalog = "config_db", name = "agency_users")
@Entity
@IdClass(value = AgencyUsersKey::class)
class AgencyUsers {
    @Id
    @Column(name = "agency_id")
    var agencyId: Long? = null

    @Id
    @Column(name = "user_id")
    var userId: Long? = null
}
