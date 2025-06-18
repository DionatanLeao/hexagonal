package com.devdeolho.hexagonal.config

import com.devdeolho.hexagonal.adapters.output.FindAddressByZipCodeAdapter
import com.devdeolho.hexagonal.adapters.output.SendCpfForValidationAdapter
import com.devdeolho.hexagonal.adapters.output.UpdateCustomerAdapter
import com.devdeolho.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.devdeolho.hexagonal.application.core.usecase.UpdateCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateCustomerAdapter: UpdateCustomerAdapter,
        sendCpfForValidationAdapter: SendCpfForValidationAdapter
    ) = UpdateCustomerUseCase(
        findCustomerByIdUseCase,
        findAddressByZipCodeAdapter,
        updateCustomerAdapter,
        sendCpfForValidationAdapter
    )
}