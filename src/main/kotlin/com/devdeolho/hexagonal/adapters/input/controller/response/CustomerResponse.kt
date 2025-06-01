package com.devdeolho.hexagonal.adapters.input.controller.response

import com.devdeolho.hexagonal.application.core.domain.Customer

data class CustomerResponse(
    val id: String,
    val name: String,
    var address: AddressResponse,
    val cpf: String,
    val isValidCpf: Boolean
) {

    constructor(customer: Customer): this (
        customer.id!!,
        customer.name,
        AddressResponse(customer.address!!),
        customer.cpf,
        customer.isValidCpf
    )
}
