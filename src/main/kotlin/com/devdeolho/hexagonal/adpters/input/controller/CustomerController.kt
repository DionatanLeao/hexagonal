package com.devdeolho.hexagonal.adpters.input.controller

import com.devdeolho.hexagonal.adpters.input.controller.request.CustomerRequest
import com.devdeolho.hexagonal.adpters.input.controller.response.CustomerResponse
import com.devdeolho.hexagonal.application.core.domain.Customer
import com.devdeolho.hexagonal.application.ports.input.DeleteCustomerByIdInputPort
import com.devdeolho.hexagonal.application.ports.input.FindCustomerByIdInputPort
import com.devdeolho.hexagonal.application.ports.input.InsertCustomerInputPort
import com.devdeolho.hexagonal.application.ports.input.UpdateCustomerInputPort
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerInputPort: InsertCustomerInputPort,
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val updateCustomerInputPort: UpdateCustomerInputPort,
    private val deleteCustomerByIdInputPort: DeleteCustomerByIdInputPort
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(@RequestBody @Valid customerRequest: CustomerRequest) {
        with(customerRequest) {
            val customer = Customer(name = name, cpf = cpf)
            insertCustomerInputPort.insert(customer, zipCode)
        }
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun findById(@PathVariable id: String): CustomerResponse {
        val customer = findCustomerByIdInputPort.find(id)
        return CustomerResponse(customer)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(
        @PathVariable id: String,
        @Valid @RequestBody customerRequest: CustomerRequest
    ) {
        with(customerRequest) {
            val customer = Customer(id, name, cpf = cpf)
            updateCustomerInputPort.update(customer, zipCode)
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String) {
        deleteCustomerByIdInputPort.delete(id)
    }
}