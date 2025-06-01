package com.devdeolho.hexagonal.adapters.output

import com.devdeolho.hexagonal.adapters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.adapters.output.repository.entity.CustomerEntity
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.output.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val customerRepository: CustomerRepository
) : InsertCustomerOutputPort {

    override fun insert(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }
}