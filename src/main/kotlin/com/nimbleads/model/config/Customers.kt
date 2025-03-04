package com.nimbleads.model.config

import com.nimbleads.model.users.User
import jakarta.persistence.*
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import org.hibernate.annotations.GenericGenerator


@Table(schema = "config_db", catalog = "config_db", name = "customers")
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
class Customers {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private var customerId: Long? = null

    private val name: String? = null
    private val enabled: Boolean? = null

    @Column(name = "models_db_id")
    private var modelsDbId: Long? = null

    @Column(name = "restrict_performance_computation_to_same_sku_conversions")
    private var restrictPerformanceComputationToSameSkuConversions: String? = null

    @Column(name = "is_direct")
    private var direct = false


    @Transient
    private val user: User? = null

    @Column(name = "user_id")
    private var userId: Long? = null

    @Column(name = "company_name")
    private var companyName: String? = null

    @Column(name = "address")
    private var address: String? = null

    @Column(name = "phone_number")
    private var phoneNumber: String? = null

    @Column(name = "email")
    private var email: String? = null


    @ManyToMany(mappedBy = "customers")
    var agencies: MutableList<Agencies> = mutableListOf()


    @ManyToMany(fetch = FetchType.EAGER)
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JoinTable(
        catalog = "config_db",
        name = "customer_marketplace",
        joinColumns = [JoinColumn(name = "customer_id", referencedColumnName = "customer_id")],
        inverseJoinColumns = [JoinColumn(name = "marketplace_id", referencedColumnName = "marketplace_id")]
    )
    private val marketplaces: List<Marketplaces>? = null


    // Amazon
    @Transient
    private val token: String? = null

    // Instacart
    @Transient
    private val refreshToken: String? = null

    @Transient
    private val clientId: String? = null

    @Transient
    private val clientSecret: String? = null

    @Transient
    private val redirectUrl: String? = null

    //Wallmart
    @Transient
    private val wallmartAdvertiserId: Long? = null
}
