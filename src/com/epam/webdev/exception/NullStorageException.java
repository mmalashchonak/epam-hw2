package com.epam.webdev.exception;

public class NullStorageException extends Exception {
    public NullStorageException() {
        super("Storage is null.");
    }
}
