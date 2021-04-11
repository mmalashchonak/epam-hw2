package com.epam.webdev.exception;

public class IncorrectWeightException extends Exception{
    public IncorrectWeightException() {
        super("Input weight can not be negative or 0.");
    }

    public IncorrectWeightException(String message) {
        super(message);
    }

    public IncorrectWeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectWeightException(Throwable cause) {
        super(cause);
    }
}
