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
    basePackages = ["com.nimbleads.repository.instacart"],
    entityManagerFactoryRef = "instacartEntityManager",
    transactionManagerRef = "instacartTransactionManager"
)
class InstaCartDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    fun instacartEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = instacartDataSource()
        em.setPackagesToScan(
            "com.nimbleads.model.instacart"
        )

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
    fun instacartDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.username = env!!.getProperty("spring.instacart.datasource.username")
        hikariDataSource.password = env.getProperty("spring.instacart.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.instacart.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.instacart.datasource.driver-class-name")

        return hikariDataSource

        //        return DataSourceBuilder.create()
//                .url(env.getProperty("spring.instacart.datasource.url"))
//                .driverClassName(env.getProperty("spring.instacart.datasource.driver-class-name"))
//                .username(env.getProperty("spring.instacart.datasource.username"))
//                .password(env.getProperty("spring.instacart.datasource.password"))
//                .build();
    }

    @Bean
    fun instacartTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = instacartEntityManager().getObject()
        return transactionManager
    }
}
