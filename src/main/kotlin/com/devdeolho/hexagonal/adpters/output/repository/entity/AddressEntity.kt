package com.devdeolho.hexagonal.adpters.output.repository.entity

import com.devdeolho.hexagonal.application.core.domain.Address

class AddressEntity(
    val street: String,
    val city: String,
    val state: String
) {

    constructor(address: Address) : this(
        address.street,
        address.city,
        address.state
    )
}
