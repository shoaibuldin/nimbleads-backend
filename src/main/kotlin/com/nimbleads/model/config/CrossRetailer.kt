package com.nimbleads.model.config

import jakarta.persistence.*
import jakarta.validation.constraints.Size

@Entity
@Table(schema = "config_db", catalog = "config_db", name = "cross_retailer")
class CrossRetailer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private var id: Int? = null

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private var name: String? = null

    @Size(max = 100)
    @Column(name = "contact_person", length = 100)
    private var contactPerson: String? = null

    @OneToMany(mappedBy = "crossRetailerId", fetch = FetchType.EAGER)
    private val crossRetailerCustomers: List<CrossRetailerCustomer>? = null
}