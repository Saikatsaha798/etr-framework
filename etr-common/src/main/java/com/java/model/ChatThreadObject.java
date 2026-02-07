package com.java.model;

import lombok.Data;

import java.util.Map;

/**
 * The type Chat thread object.
 */
@Data
public class ChatThreadObject {
    /**
     * The Owner user id.
     */
    String ownerUserId;
    /**
     * The Chats.
     */
    Map<String, ChatObject> chats;
}
