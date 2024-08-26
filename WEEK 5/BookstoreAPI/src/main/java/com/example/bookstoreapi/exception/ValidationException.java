package com.example.bookstoreapi.exception;

import java.io.Serial;
import java.io.Serializable;

public class ValidationException extends RuntimeException implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public ValidationException(String message) {
        super(message);
    }
}
