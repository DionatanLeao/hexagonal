package com.devdeolho.hexagonal.adpters.output

import com.devdeolho.hexagonal.application.ports.output.SendCpfForValidationOutputPort
import org.springframework.kafka.core.KafkaTemplate

class SendCpfForValidationAdapter(
    private val kafkaTemplate: KafkaTemplate<String, String>
) : SendCpfForValidationOutputPort {

    override fun send(cpf: String) {
        kafkaTemplate.send("tp-cpf-validation", cpf)
    }
}