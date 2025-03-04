package com.nimbleads.model.reports


import jakarta.persistence.*


@Entity
@Table(catalog = "reportdb", name = "tracker_zip_codes")
class TrackerZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zip_code_id")
    private var zipCodeId: Long? = null

    @Column(name = "address")
    private var address: String? = null

    @Column(name = "zip_code")
    private var zipCode: String? = null

    @Column(name = "name")
    private var name: String? = null
}
