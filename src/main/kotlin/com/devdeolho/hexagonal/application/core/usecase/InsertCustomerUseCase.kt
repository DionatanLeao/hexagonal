package com.devdeolho.hexagonal.application.core.usecase

import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.input.InsertCustomerInputPort
import com.devdeolho.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort
import com.devdeolho.hexagonal.application.ports.output.InsertCustomerOutputPort
import com.devdeolho.hexagonal.application.ports.output.SendCpfForValidationOutputPort

class InsertCustomerUseCase(
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertCustomerOutputPort: InsertCustomerOutputPort,
    private val sendCpfForValidationOutputPort: SendCpfForValidationOutputPort
): InsertCustomerInputPort {

    override fun insert(customer: Customer, zipCode: String) {
        customer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            insertCustomerOutputPort.insert(it)
            sendCpfForValidationOutputPort.send(it.cpf)
        }
    }
}