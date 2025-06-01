package com.devdeolho.hexagonal.adapters.output

import com.devdeolho.hexagonal.adapters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.adapters.output.repository.entity.CustomerEntity
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.output.UpdateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class UpdateCustomerAdapter(
    private val customerRepository: CustomerRepository
): UpdateCustomerOutputPort {

    override fun update(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }

}