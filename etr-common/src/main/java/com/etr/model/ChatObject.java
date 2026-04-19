package com.etr.model;

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
    private String chatId;
    /**
     * The Other user id.
     */
    private String otherUserId;
    /**
     * The Messages.
     */
    private List<MessageObject> messages;
}
