package com.nimbleads.model.billing

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*

@Entity

@Table(catalog = "billing_db", name = "currency")
class Currencies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0

    @Column(name = "currency_code")
    private var currencyCode: String? = null

    @Column(name = "country_code")
    private var countryCode: String? = null

    @Column(name = "currency_name")
    private var currencyName: String? = null

    @Column(name = "country_name")
    private var countryName: String? = null

    @Column(name = "currency_symbol")
    private var currencySymbol: String? = null

    @Column(name = "conversion_rate")
    private var conversionRate: Double? = null


    private val status = false


    @CreatedDate
    @Column(name = "created_date")
    private var createdDate: Date? = null

    @LastModifiedDate
    @Column(name = "modified_date")
    private var modifiedDate: Date? = null
}
