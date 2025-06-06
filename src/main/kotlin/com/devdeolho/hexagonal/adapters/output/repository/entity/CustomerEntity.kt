package com.devdeolho.hexagonal.adapters.output.repository.entity

import com.devdeolho.hexagonal.adapters.output.client.response.AddressEntity
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document(collection = "customers")
data class CustomerEntity(
    @MongoId val id: String,
    val name: String,
    val address: AddressEntity,
    val cpf: String,
    val isValidCpf: Boolean
)
