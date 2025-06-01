package com.devdeolho.hexagonal.adapters.output

import com.devdeolho.hexagonal.adapters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.output.FindCustomerByIdOutputPort
import org.springframework.stereotype.Component
import kotlin.jvm.optionals.getOrNull

@Component
class FindCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
) : FindCustomerByIdOutputPort {
    override fun find(id: String): Customer? =
        customerRepository.findById(id).getOrNull().let {
                return it?.toCustomer()
        }
}