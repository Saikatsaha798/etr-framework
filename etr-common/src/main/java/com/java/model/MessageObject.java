package com.java.model;

import lombok.Data;

import java.time.Instant;

@Data
public class MessageObject {
    String messageId;
    Instant sentAt;
    String senderId;
    String text;
}
