package com.devdeolho.hexagonal.adapters.input.consumer

import com.devdeolho.hexagonal.adapters.input.consumer.message.CustomerMessage
import com.devdeolho.hexagonal.application.ports.input.UpdateCustomerInputPort
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ReceiveValidatedCustomerDataConsumer(
    private val updateCustomerInputPort: UpdateCustomerInputPort
) {

    @KafkaListener(topics = ["tp-cpf-validated"], groupId = "devdeolho")
    fun receive(customerMessage: CustomerMessage) {
        with(customerMessage) {
            updateCustomerInputPort.update(toCustomer(), zipCode)
        }
    }
}