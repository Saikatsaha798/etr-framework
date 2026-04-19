package com.etr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * The type Message entity.
 */
@Data
@Entity
public class MessageEntity {
    @Id
    private String messageId;
    private String sentAt;
    private String senderId;
    private String text;
}
