package com.devdeolho.hexagonal.application.ports.output

interface DeleteCustomerOutputPort {

    fun delete(id: String)
}