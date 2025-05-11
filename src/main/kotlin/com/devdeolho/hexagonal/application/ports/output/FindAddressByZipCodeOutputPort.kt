package com.devdeolho.hexagonal.application.ports.output

import com.devdeolho.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {

    fun find(zipCode: String) : Address
}