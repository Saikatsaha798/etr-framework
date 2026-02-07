package com.java.producer;

/**
 * The interface Kafka producer.
 */
public interface KafkaProducer {

    /**
     * Publish.
     *
     * @param topic   the topic
     * @param key     the key
     * @param message the message
     */
    void publish(String topic, String key, Object message);
}
