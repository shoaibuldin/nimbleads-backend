package com.nimbleads

import com.nimbleads.config.auth.JwtProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.nimbleads.*"])
@EnableConfigurationProperties(JwtProperties::class)

class NimbleadsApplication

fun main(args: Array<String>) {
	runApplication<NimbleadsApplication>(*args)
}
