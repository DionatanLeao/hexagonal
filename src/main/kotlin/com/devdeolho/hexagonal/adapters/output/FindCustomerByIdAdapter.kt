package com.devdeolho.hexagonal.adapters.output

import com.devdeolho.hexagonal.adapters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.output.FindCustomerByIdOutputPort
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class FindCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
) : FindCustomerByIdOutputPort {

    override fun find(id: String): Customer? =
        customerRepository.findByIdOrNull(id).let {
            return it?.toCustomer()
        }

}