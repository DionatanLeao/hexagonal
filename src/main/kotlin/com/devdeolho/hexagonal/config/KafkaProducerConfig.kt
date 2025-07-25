package com.devdeolho.hexagonal.config

import org.apache.kafka.clients.producer.ProducerConfig.*
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory

@Configuration
class KafkaProducerConfig {

    private val configProps = mapOf(
        BOOTSTRAP_SERVERS_CONFIG to "localhost:9092",
        KEY_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java,
        VALUE_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java
    )

    @Bean
    fun producerFactory(): ProducerFactory<String, String> =
        DefaultKafkaProducerFactory(configProps)

    @Bean
    fun kafkaTemplate() = KafkaTemplate(producerFactory())

}