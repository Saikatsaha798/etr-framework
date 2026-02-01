package com.java.model;

import lombok.Data;

import java.util.List;

@Data
public class ChatObject {
    String chatId;
    String otherUserId;
    List<MessageObject> messages;
}
