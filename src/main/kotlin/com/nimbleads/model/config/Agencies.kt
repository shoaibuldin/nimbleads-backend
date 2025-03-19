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
    var agencyId: Long? = null

    @Column(name = "agency_name")
    var agencyName: String? = null

    @Column(name = "agency_email")
    var agencyEmail: String? = null

    @Column(name = "agency_prefix")
    var agencyPrefix: String? = null

    val enabled: Boolean? = null


    //  @OneToOne
    //  @JoinColumn(name = "userId")
    //  @JsonIgnore
    @Transient
    val user: User? = null

    @Column(name = "user_id")
    @JsonIgnore
    var userId: Long? = null

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "agency_customers",
        catalog = "config_db",
        joinColumns = [JoinColumn(name = "agency_id")],
        inverseJoinColumns = [JoinColumn(name = "customer_id")]
    )
    val customers: List<Customers> = ArrayList()
}
