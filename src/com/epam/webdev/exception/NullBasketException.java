package com.epam.webdev.exception;

public class NullBasketException extends Exception{
    public NullBasketException() {
        super("Basket can not be null.");
    }

    public NullBasketException(String message) {
        super(message);
    }

    public NullBasketException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullBasketException(Throwable cause) {
        super(cause);
    }
}
