package com.cikada.zhelezoapi.config

import com.cikada.zhelezoapi.service.InitService
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class InitConfig {
    @Bean
    open fun initDb(initService: InitService) = ApplicationRunner {
        initService.initParts()
    }
}