package com.nimbleads.config.database

import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.transaction.PlatformTransactionManager
import java.util.*
import jakarta.persistence.*

@Configuration
@EnableJpaRepositories(
    basePackages = ["com.nimbleads.repository.billing"],
    entityManagerFactoryRef = "billingEntityManager",
    transactionManagerRef = "billingTransactionManager"
)
class BillingDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    fun billingEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = billingDataSource()
        em.setPackagesToScan("com.nimbleads.model.billing")

        val vendor = HibernateJpaVendorAdapter()
        vendor.setGenerateDdl(true)
        em.jpaVendorAdapter = vendor
        val props = Properties()

        props["hibernate.hbm2ddl.auto"] = env?.getProperty("spring.jpa.hibernate.ddl-auto")
        props["show-sql"] = env?.getProperty("spring.jpa.show-sql")
        em.setJpaProperties(props)

        return em
    }

    @Bean
    fun billingDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.username = env!!.getProperty("spring.billing.datasource.username")
        hikariDataSource.password = env.getProperty("spring.billing.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.billing.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.billing.datasource.driver-class-name")

        return hikariDataSource
    }

    @Bean
    fun billingTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = billingEntityManager().getObject()
        return transactionManager
    }
}
