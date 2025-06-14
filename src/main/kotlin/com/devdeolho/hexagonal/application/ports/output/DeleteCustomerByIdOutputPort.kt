package com.devdeolho.hexagonal.application.ports.output

interface DeleteCustomerByIdOutputPort {

    fun delete(id: String)
}