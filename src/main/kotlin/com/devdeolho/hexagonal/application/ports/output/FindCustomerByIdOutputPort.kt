package com.devdeolho.hexagonal.application.ports.output

import com.devdeolho.hexagonal.application.core.domain.Customer

interface FindCustomerByIdOutputPort {

    fun find(id: String): Customer?
}