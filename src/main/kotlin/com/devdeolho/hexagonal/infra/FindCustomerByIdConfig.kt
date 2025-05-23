package com.devdeolho.hexagonal.infra

import com.devdeolho.hexagonal.adpters.output.FindCustomerByIdAdapter
import com.devdeolho.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerById(findCustomerByIdAdapter: FindCustomerByIdAdapter) =
        FindCustomerByIdUseCase(findCustomerByIdAdapter)
}