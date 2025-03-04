package com.nimbleads.model.reports

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(catalog = "reportdb", name = "amazon_listing_analyzer")
class AmazonListingAnalyzer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(name = "amazon_score")
    private var amazonScore: String? = null

    @Column(name = "asin")
    private var asin: String? = null

    @Column(name = "feature")
    private var feature: String? = null

    @Column(name = "user_id")
    private var userId: Long? = null

    @Column(name = "analyzed_date_time")
    private var analyzedDateTime: LocalDateTime? = null

    @Lob
    @Column(name = "json_response")
    private var jsonResponse: String? = null
}
