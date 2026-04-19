package com.etr.exception;

import lombok.Data;

/**
 * The type Message exception.
 */
@Data
public class MessageException extends RuntimeException{

    private final int status;
    private final String errorCode;

    /**
     * Instantiates a new Message exception.
     *
     * @param message   the message
     * @param status    the status
     * @param errorCode the error code
     */
    public MessageException(String message, int status, String errorCode) {
        super(message);
        this.status = status;
        this.errorCode = errorCode;
    }
}
