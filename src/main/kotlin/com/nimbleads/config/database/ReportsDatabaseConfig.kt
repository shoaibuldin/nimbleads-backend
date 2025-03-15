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
    basePackages = ["com.nimbleads.repository.reports"],
    entityManagerFactoryRef = "reportsEntityManager",
    transactionManagerRef = "reportsTransactionManager"
)
class ReportsDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    fun reportsEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = reportsDataSource()
        em.setPackagesToScan("com.nimbleads.model.reports")

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
    fun reportsDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.connectionTimeout = 45000

        hikariDataSource.username = env!!.getProperty("spring.reports.datasource.username")
        hikariDataSource.password = env.getProperty("spring.reports.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.reports.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.reports.datasource.driver-class-name")

        return hikariDataSource

        //        return DataSourceBuilder.create()
//                .url(env.getProperty("spring.reports.datasource.url"))
//                .driverClassName(env.getProperty("spring.reports.datasource.driver-class-name"))
//                .username(env.getProperty("spring.reports.datasource.username"))
//                .password(env.getProperty("spring.reports.datasource.password"))
//                .build();
    }

    @Bean
    fun reportsTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = reportsEntityManager().getObject()
        return transactionManager
    }
}
