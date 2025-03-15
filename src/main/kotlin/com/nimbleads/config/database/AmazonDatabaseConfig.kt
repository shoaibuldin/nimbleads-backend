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
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*

@Configuration
@EnableJpaRepositories(
    basePackages = ["com.nimbleads.repository.amazon"],
    entityManagerFactoryRef = "amazonEntityManager",
    transactionManagerRef = "amazonTransactionManager"
)
@EnableTransactionManagement
class AmazonDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    fun amazonEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = amazonDataSource()
        em.setPackagesToScan(
            "com.nimbleads.model.amazon"
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
    fun amazonDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.username = env!!.getProperty("spring.amazon.datasource.username")
        hikariDataSource.password = env.getProperty("spring.amazon.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.amazon.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.amazon.datasource.driver-class-name")

        return hikariDataSource

        //        return DataSourceBuilder.create()
//                .url(env.getProperty("spring.amazon.datasource.url"))
//                .driverClassName(env.getProperty("spring.amazon.datasource.driver-class-name"))
//                .username(env.getProperty("spring.amazon.datasource.username"))
//                .password(env.getProperty("spring.amazon.datasource.password"))
//                .build();
    }

    @Bean
    fun amazonTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = amazonEntityManager().getObject()
        return transactionManager
    }
}