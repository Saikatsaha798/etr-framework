package com.java.model;

import lombok.Data;

import java.util.List;

/**
 * The type Chat object.
 */
@Data
public class ChatObject {
    /**
     * The Chat id.
     */
    String chatId;
    /**
     * The Other user id.
     */
    String otherUserId;
    /**
     * The Messages.
     */
    List<MessageObject> messages;
}
