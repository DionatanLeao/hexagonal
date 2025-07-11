package com.devdeolho.hexagonal.adapters.input.controller.response

import com.devdeolho.hexagonal.application.core.domain.Address

data class AddressResponse(
    val street: String,
    val city: String,
    val state: String
) {

    constructor(address: Address): this(
        address.street,
        address.city,
        address.state
    )

}