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

@Configuration
@EnableJpaRepositories(
    basePackages = ["com.nimbleads.repository.config"],
    entityManagerFactoryRef = "configEntityManager",
    transactionManagerRef = "configTransactionManager"
)
class ConfigDatabaseConfig {
    @Autowired
    private val env: Environment? = null

    @Bean
    fun configEntityManager(): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = configDataSource()
        em.setPackagesToScan("com.nimbleads.model.config")

        val vendor = HibernateJpaVendorAdapter()
        vendor.setGenerateDdl(true)
        em.jpaVendorAdapter = vendor
        val props = Properties()
        props["hibernate.dialect"] = env!!.getProperty("spring.jpa.properties.hibernate.dialect")
        props["hibernate.hbm2ddl.auto"] = env.getProperty("spring.jpa.hibernate.ddl-auto")
        props["hibernate.cache.use_second_level_cache"] =
            env.getProperty("spring.jpa.properties.hibernate.cache.use_second_level_cache")
        props["hibernate.cache.region.factory_class"] =
            env.getProperty("spring.jpa.properties.hibernate.cache.region.factory_class")
        props["javax.persistence.sharedCache.mode"] =
            env.getProperty("spring.jpa.properties.javax.persistence.sharedCache.mode")
        props["hibernate.show_sql"] = env.getProperty("spring.jpa.show-sql")
        //props.put("hibernate.show_sql",true);
        em.setJpaProperties(props)


        return em
    }

    @Bean
    fun configDataSource(): HikariDataSource {
        val hikariDataSource = HikariDataSource()
        hikariDataSource.maximumPoolSize = 5
        hikariDataSource.username = env!!.getProperty("spring.config.datasource.username")
        hikariDataSource.password = env.getProperty("spring.config.datasource.password")
        hikariDataSource.jdbcUrl = env.getProperty("spring.config.datasource.url")
        hikariDataSource.driverClassName = env.getProperty("spring.config.datasource.driver-class-name")

        return hikariDataSource

        //
//        return DataSourceBuilder.create()
//                .url(env.getProperty("spring.config.datasource.url"))
//                .driverClassName(env.getProperty("spring.config.datasource.driver-class-name"))
//                .username(env.getProperty("spring.config.datasource.username"))
//                .password(env.getProperty("spring.config.datasource.password"))
//                .build();
    }

    @Bean
    fun configTransactionManager(): PlatformTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = configEntityManager().getObject()
        return transactionManager
    }
}