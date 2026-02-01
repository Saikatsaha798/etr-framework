package com.java.model;

import lombok.Data;

import java.util.Map;

@Data
public class ChatThreadObject {
    String ownerUserId;
    Map<String, ChatObject> chats;
}
