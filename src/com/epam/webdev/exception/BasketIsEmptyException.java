package com.epam.webdev.exception;

public class BasketIsEmptyException extends Exception {
    public BasketIsEmptyException(String s) {
    }

    public BasketIsEmptyException() {
        super();
    }

    public BasketIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketIsEmptyException(Throwable cause) {
        super(cause);
    }
}
