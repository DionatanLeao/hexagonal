package com.devdeolho.hexagonal.config

import com.devdeolho.hexagonal.adapters.output.FindCustomerByIdAdapter
import com.devdeolho.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerById(findCustomerByIdAdapter: FindCustomerByIdAdapter) =
        FindCustomerByIdUseCase(findCustomerByIdAdapter)

}