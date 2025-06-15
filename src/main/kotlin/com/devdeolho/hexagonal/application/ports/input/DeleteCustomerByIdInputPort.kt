package com.devdeolho.hexagonal.application.ports.input

interface DeleteCustomerByIdInputPort {

    fun delete(id: String)

}