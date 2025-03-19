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
    var customerId: Long? = null

    val name: String? = null
    val enabled: Boolean? = null

    @Column(name = "models_db_id")
    var modelsDbId: Long? = null

    @Column(name = "restrict_performance_computation_to_same_sku_conversions")
    var restrictPerformanceComputationToSameSkuConversions: String? = null

    @Column(name = "is_direct")
    var direct = false


    @Transient
    val user: User? = null

    @Column(name = "user_id")
    var userId: Long? = null

    @Column(name = "company_name")
    var companyName: String? = null

    @Column(name = "address")
    var address: String? = null

    @Column(name = "phone_number")
    var phoneNumber: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "platform")
    var platform: String? = null

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
    val marketplaces: List<Marketplaces>? = null


    // Amazon
    @Transient
    val token: String? = null

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
