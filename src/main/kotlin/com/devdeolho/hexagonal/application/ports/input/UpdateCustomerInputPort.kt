package com.devdeolho.hexagonal.application.ports.input

import com.devdeolho.hexagonal.application.core.domain.Customer

interface UpdateCustomerInputPort {

    fun update(customer: Customer, zipCode: String)
}