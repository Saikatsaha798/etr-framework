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
    private String messageId;
    /**
     * The Sent at.
     */
    private Instant sentAt;
    /**
     * The Sender id.
     */
    private String senderId;
    /**
     * The Text.
     */
    private String text;
}
