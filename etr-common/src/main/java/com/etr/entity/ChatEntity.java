package com.etr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * The type Chat entity.
 */
@Data
@Entity
public class ChatEntity {
    @Id
    private String chatId;
    private String user1;
    private String user2;
}
