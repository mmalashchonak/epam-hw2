package com.epam.webdev.exception;

public class NullBasketException extends Exception{
    public NullBasketException() {
        super("Basket can not be null.");
    }
}
