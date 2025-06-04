package com.devdeolho.hexagonal.adapters.output.client

import com.devdeolho.hexagonal.adapters.output.client.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "\${devdeolho.client.address.url}"
)
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipcode}")
    fun find(@PathVariable zipCode: String): AddressResponse
}