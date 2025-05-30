package com.devdeolho.hexagonal.infra

import com.devdeolho.hexagonal.adpters.output.FindAddressByZipCodeAdapter
import com.devdeolho.hexagonal.adpters.output.InsertCustomerAdapter
import com.devdeolho.hexagonal.adpters.output.SendCpfForValidationAdapter
import com.devdeolho.hexagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter,
        sendCpfForValidationAdapter: SendCpfForValidationAdapter
    ) = InsertCustomerUseCase(
        findAddressByZipCodeAdapter,
        insertCustomerAdapter,
        sendCpfForValidationAdapter
    )
}