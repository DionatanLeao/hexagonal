package com.devdeolho.hexagonal.adapters.output.client.response

import com.devdeolho.hexagonal.application.core.domain.Address

data class AddressResponse(
    val street: String,
    val city: String,
    val state: String
) {

    fun toAddress() = Address(street, city, state)
}
