package com.etr.model;

import lombok.Data;

import java.time.Instant;

/**
 * The type Message object.
 */
@Data
public class MessageObject {
    /**
     * The Message id.
     */
    String messageId;
    /**
     * The Sent at.
     */
    Instant sentAt;
    /**
     * The Sender id.
     */
    String senderId;
    /**
     * The Text.
     */
    String text;
}
