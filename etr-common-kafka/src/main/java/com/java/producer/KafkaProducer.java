package com.java.producer;

/**
 * The interface Kafka producer.
 */
public interface KafkaProducer<T> {

    /**
     * Publish.
     *
     * @param topic   the topic
     * @param key     the key
     * @param message the message
     */
    void publish(String topic, String key, T message);
}
