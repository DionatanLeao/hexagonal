package com.devdeolho.hexagonal.adapters.input.controller

import com.devdeolho.hexagonal.adapters.input.controller.request.CustomerRequest
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.input.InsertCustomerInputPort
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerInputPort: InsertCustomerInputPort
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(@Valid @RequestBody customerRequest: CustomerRequest) {
        with(customerRequest) {
            insertCustomerInputPort.insert(Customer(name = name, cpf = cpf), zipCode)
        }
    }
}