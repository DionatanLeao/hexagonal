package com.devdeolho.hexagonal.adapters.output.repository

import com.devdeolho.hexagonal.adapters.output.repository.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<CustomerEntity, String>