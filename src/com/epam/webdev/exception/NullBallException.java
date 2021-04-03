package com.epam.webdev.exception;

public class NullBallException extends Exception{
    public NullBallException() {
        super("Ball is null.");
    }
}
