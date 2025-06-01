package com.devdeolho.hexagonal.adapters.output

import com.devdeolho.hexagonal.adapters.output.client.FindAddressByZipCodeClient
import com.devdeolho.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
) : FindAddressByZipCodeOutputPort {

    override fun find(zipCode: String) = findAddressByZipCodeClient.find(zipCode).toAddress()
}