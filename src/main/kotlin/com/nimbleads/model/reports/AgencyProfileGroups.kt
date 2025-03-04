package com.nimbleads.model.reports


import jakarta.persistence.*


@Entity
@IdClass(value = AgencyProfileGroupsKey::class)
@Table(catalog = "reportdb", name = "agency_profile_groups")
class AgencyProfileGroups {
    @Id
    @Column(name = "agency_id")
    private var agencyId: Long = 0

    @Id
    @Column(name = "profile_id")
    private var profileId: Long? = null

    @Id
    @Column(name = "customer_id")
    private var customerId: Long = 0

    @Column(name = "customer_name")
    private var customerName: String? = null
}
