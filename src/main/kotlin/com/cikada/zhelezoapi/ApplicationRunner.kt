package com.cikada.zhelezoapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackageClasses = [ApplicationRunner::class])
open class ApplicationRunner

fun main(args: Array<String>) {
    runApplication<ApplicationRunner>(*args)
}

