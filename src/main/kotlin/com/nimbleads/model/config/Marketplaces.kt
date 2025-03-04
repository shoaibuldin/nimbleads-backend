package com.nimbleads.model.config

import jakarta.persistence.*
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import org.hibernate.annotations.GenericGenerator


@Table(schema = "config_db", catalog = "config_db", name = "marketplaces")
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
class Marketplaces {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "marketplace_id")
    private var marketplaceId: Long? = null

    private val name: String? = null


    @ManyToMany(mappedBy = "marketplaces")
    private val customers: List<Customers>? = null
}
