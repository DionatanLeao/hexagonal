package com.devdeolho.hexagonal.application.core.usecase

import com.devdeolho.hexagonal.application.ports.input.FindCustomerByIdInputPort
import com.devdeolho.hexagonal.application.ports.output.DeleteCustomerOutputPort

class DeleteCustomerByIdUseCase(
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val deleteCustomerOutputPort: DeleteCustomerOutputPort
) {

    fun delete(id: String) {
        findCustomerByIdInputPort.find(id)
        deleteCustomerOutputPort.delete(id)
    }
}