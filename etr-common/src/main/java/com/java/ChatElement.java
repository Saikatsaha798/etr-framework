package com.java;

import lombok.Data;

import java.time.Instant;

@Data
public class ChatElement {
    Instant sentAt;
    String text;
}
