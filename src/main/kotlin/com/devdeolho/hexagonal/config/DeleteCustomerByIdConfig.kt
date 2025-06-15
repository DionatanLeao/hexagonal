package com.devdeolho.hexagonal.config

import com.devdeolho.hexagonal.adapters.output.DeleteCustomerByIdAdapter
import com.devdeolho.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.devdeolho.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerByIdConfig {

    @Bean
    fun deleteCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        deleteCustomerByIdAdapter: DeleteCustomerByIdAdapter
    ) = DeleteCustomerByIdUseCase(
        findCustomerByIdUseCase,
        deleteCustomerByIdAdapter
    )
}