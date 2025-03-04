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
    basePackages = ["com.nimbleads.repository.current_models"],
    entityManagerFactoryRef = "modelsEntityManager",
    transactionManagerRef = "modelsTransactionManager"
)
class ModelsDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    fun modelsEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = modelsDataSource()
        em.setPackagesToScan("com.nimbleads.model.current_models")

        val vendor = HibernateJpaVendorAdapter()
        vendor.setGenerateDdl(true)
        em.jpaVendorAdapter = vendor
        val props = Properties()
        props["hibernate.dialect"] = env!!.getProperty("spring.jpa.properties.hibernate.dialect")
        props["hibernate.hbm2ddl.auto"] = env.getProperty("spring.jpa.hibernate.ddl-auto")
        props["show-sql"] = env.getProperty("spring.jpa.show-sql")
        em.setJpaProperties(props)

        return em
    }

    @Bean
    fun modelsDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.connectionTimeout = 45000

        hikariDataSource.username = env!!.getProperty("spring.models.datasource.username")
        hikariDataSource.password = env.getProperty("spring.models.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.models.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.models.datasource.driver-class-name")

        return hikariDataSource
    }

    @Bean
    fun modelsTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = modelsEntityManager().getObject()
        return transactionManager
    }
}
