package com.devdeolho.hexagonal.application.ports.input

import com.devdeolho.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {

    fun find(id: String): Customer
}