package com.nimbleads.model.reports

import jakarta.persistence.*

@Table(schema = "reportdb", catalog = "reportdb", name = "keyword_term_mapping")
@Entity
class KeywordTermMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(name = "search_term")
    private var searchTerm: String? = null
    private val category: String? = null

    @Column(name = "search_term_condition")
    private var condition: String? = null

    @Column(name = "customer_id")
    private var customerId: Long? = null
}
