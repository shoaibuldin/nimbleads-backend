package com.nimbleads.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.nimbleads.*"])

class NimbleadsApplication

fun main(args: Array<String>) {
	runApplication<NimbleadsApplication>(*args)
}
