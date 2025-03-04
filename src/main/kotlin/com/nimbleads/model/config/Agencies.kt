package com.nimbleads.model.config

import com.fasterxml.jackson.annotation.JsonIgnore
import com.nimbleads.model.users.User
import jakarta.persistence.*
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import org.hibernate.annotations.GenericGenerator


@Table(schema = "config_db", catalog = "config_db", name = "agencies")
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
class Agencies {
    @Id
    @Column(name = "agency_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var agencyId: Long? = null

    @Column(name = "agency_name")
    private var agencyName: String? = null

    @Column(name = "agency_email")
    private var agencyEmail: String? = null

    @Column(name = "agency_prefix")
    private var agencyPrefix: String? = null

    private val enabled: Boolean? = null


    //  @OneToOne
    //  @JoinColumn(name = "userId")
    //  @JsonIgnore
    @Transient
    private val user: User? = null

    @Column(name = "user_id")
    @JsonIgnore
    private var userId: Long? = null

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "agency_customers",
        catalog = "config_db",
        joinColumns = [JoinColumn(name = "agency_id")],
        inverseJoinColumns = [JoinColumn(name = "customer_id")]
    )
    private val customers: List<Customers> = ArrayList()
}
