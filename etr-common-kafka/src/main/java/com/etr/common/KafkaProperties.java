package com.etr.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The type Kafka properties.
 */
@ConfigurationProperties(prefix = "kafka.topics")
@Data
public class KafkaProperties {

    private String messageConversation;
}
