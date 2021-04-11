package com.epam.webdev.exception;

public class NullStorageException extends Exception {
    public NullStorageException() {
        super("Storage is null.");
    }

    public NullStorageException(String message) {
        super(message);
    }

    public NullStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullStorageException(Throwable cause) {
        super(cause);
    }
}
