package com.devdeolho.hexagonal.adpters.output

import com.devdeolho.hexagonal.adpters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort
import org.springframework.stereotype.Component

@Component
class DeleteCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
) : DeleteCustomerByIdOutputPort {

    override fun delete(id: String) {
        customerRepository.deleteById(id)
    }
}