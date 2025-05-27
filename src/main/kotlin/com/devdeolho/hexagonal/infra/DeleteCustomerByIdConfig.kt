package com.devdeolho.hexagonal.infra

import com.devdeolho.hexagonal.adpters.output.DeleteCustomerByIdAdapter
import com.devdeolho.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.devdeolho.hexagonal.application.ports.input.FindCustomerByIdInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerByIdConfig {

    @Bean
    fun deleteCustomerById(
        findCustomerByIdInputPort: FindCustomerByIdInputPort,
        deleteCustomerByIdAdapter: DeleteCustomerByIdAdapter
    ) = DeleteCustomerByIdUseCase(findCustomerByIdInputPort, deleteCustomerByIdAdapter)
}