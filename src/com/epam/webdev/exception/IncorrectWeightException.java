package com.epam.webdev.exception;

public class IncorrectWeightException extends Exception{
    public IncorrectWeightException() {
        super("Input weight can not be negative or 0.");
    }
}
