package com.devdeolho.hexagonal.application.ports.output

interface SendCpfForValidationOutputPort {

    fun send(cpf: String)
}