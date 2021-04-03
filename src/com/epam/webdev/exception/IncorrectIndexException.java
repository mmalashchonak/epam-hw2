package com.epam.webdev.exception;

public class IncorrectIndexException extends Exception {
    public IncorrectIndexException() {
        super("Input index is incorrect.");
    }
}
