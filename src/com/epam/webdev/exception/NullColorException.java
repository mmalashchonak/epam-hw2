package com.epam.webdev.exception;

public class NullColorException extends Exception {
    public NullColorException(String s) {
    }

    public NullColorException() {
        super();
    }

    public NullColorException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullColorException(Throwable cause) {
        super(cause);
    }
}
