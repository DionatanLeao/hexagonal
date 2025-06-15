package com.devdeolho.hexagonal.adapters.output

import com.devdeolho.hexagonal.adapters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort
import org.springframework.stereotype.Component

@Component
class DeleteCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
): DeleteCustomerByIdOutputPort {

    override fun delete(id: String) {
        customerRepository.deleteById(id)
    }

}