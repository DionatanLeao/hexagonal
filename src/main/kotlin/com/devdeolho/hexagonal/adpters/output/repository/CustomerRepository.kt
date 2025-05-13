package com.devdeolho.hexagonal.adpters.output.repository

import com.devdeolho.hexagonal.adpters.output.repository.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<CustomerEntity, String>