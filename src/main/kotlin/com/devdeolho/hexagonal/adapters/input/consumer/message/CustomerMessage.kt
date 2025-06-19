package com.devdeolho.hexagonal.adapters.input.consumer.message

data class CustomerMessage(
    val id: String,
    val name: String,
    val zipCode: String,
    val cpf: String,
    val isValidCpf: Boolean
)
