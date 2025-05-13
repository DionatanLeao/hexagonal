package com.devdeolho.hexagonal.application.ports.input

import com.devdeolho.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {

    fun insert(customer: Customer, zipCode: String)
}