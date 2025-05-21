package com.devdeolho.hexagonal.adpters.output

import com.devdeolho.hexagonal.adpters.output.repository.CustomerRepository
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.output.FindCustomerByIdOutputPort
import org.springframework.stereotype.Component
import kotlin.jvm.optionals.getOrNull

@Component
class FindCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
) : FindCustomerByIdOutputPort {
    override fun find(id: String): Customer? {
        return customerRepository.findById(id)
            .getOrNull()
            .let {
                return it?.toCustomer()
            }
    }

}