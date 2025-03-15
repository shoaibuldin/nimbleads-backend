package com.nimbleads.config.database

import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.core.env.Environment
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.transaction.PlatformTransactionManager
import java.util.*
import jakarta.persistence.*import jakarta.persistence.*

@Configuration
@EnableJpaRepositories(
    basePackages = ["com.nimbleads.repository.users"],
    entityManagerFactoryRef = "authEntityManager",
    transactionManagerRef = "authTransactionManager"
)
class AuthDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    @Primary
    fun authEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = authDataSource()
        em.setPackagesToScan("com.nimbleads.model.users")

        val vendor = HibernateJpaVendorAdapter()
        vendor.setGenerateDdl(true)
        em.jpaVendorAdapter = vendor
        val props = Properties()

        props["hibernate.hbm2ddl.auto"] = env?.getProperty("spring.jpa.hibernate.ddl-auto")
        props["show-sql"] = env?.getProperty("spring.jpa.show-sql")
        em.setJpaProperties(props)


        return em
    }

    @Primary
    @Bean
    fun authDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.username = env!!.getProperty("spring.auth.datasource.username")
        hikariDataSource.password = env.getProperty("spring.auth.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.auth.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.auth.datasource.driver-class-name")

        return hikariDataSource

        /*        return DataSourceBuilder.create()
                .url(env.getProperty("spring.auth.datasource.url"))
                .driverClassName(env.getProperty("spring.auth.datasource.driver-class-name"))
                .username(env.getProperty("spring.auth.datasource.username"))
                .password(env.getProperty("spring.auth.datasource.password"))
                .build();*/
    }

    @Primary
    @Bean
    fun authTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = authEntityManager().getObject()
        return transactionManager
    }
}
