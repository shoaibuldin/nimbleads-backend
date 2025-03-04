package com.nimbleads.model.amazon



import java.util.*
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate


@Table(schema = "amazon", catalog = "amazon", name = "amazon_media_assets")
@Entity
class AmazonMediaAssets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0

    @Column(name = "na_customer_id")
    private val customerId: Long? = null

    @Column(name = "amazon_profile_id")
    private val profileId: String? = null

    @Column(name = "asin")
    private val asin: String? = null

    @Column(name = "media_id")
    private val mediaId: String? = null

    @Column(name = "brand_id")
    private val brandId: String? = null

    @Column(name = "brand_name")
    private val brandName: String? = null

    @Column(name = "media_title")
    private val mediaTitle: String? = null

    @Column(name = "media_description")
    private val mediaDescription: String? = null

    @Column(name = "media_path")
    private val mediaPath: String? = null

    private val status: String? = null

    @Column(name = "error_message")
    private val errorMessage: String? = null

    @CreatedDate
    @Column(name = "created_date")
    private val createdDate: Date? = null
}
