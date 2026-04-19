package com.etr.model;

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
    private String ownerUserId;
    /**
     * The Chats.
     */
    private Map<String, ChatObject> chats;
}
