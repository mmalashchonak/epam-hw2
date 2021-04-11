package com.epam.webdev.service;

import com.epam.webdev.entity.Ball;
import com.epam.webdev.entity.Basket;
import com.epam.webdev.entity.Color;
import com.epam.webdev.exception.NullBasketException;
import com.epam.webdev.exception.NullColorException;
import com.epam.webdev.exception.NullStorageException;

public class BasketProcessor {

    public static double calculateAllBasketBallsWeight(Basket basket) throws NullBasketException, NullStorageException {
        if (basket == null) {
            throw new NullBasketException("Basket can not be null.");
        }

        if (basket.getStorage() == null) {
            throw new NullStorageException("Storage can not be null.");
        }

        double ballsWeight = 0;

        for (Ball ball : basket.getStorage()) {
            ballsWeight += ball.getWeight();
        }

        return ballsWeight;
    }

    public static int calculateBasketBallsWithColor(Basket basket, Color color) throws NullBasketException, NullStorageException, NullColorException {
        if (basket == null) {
            throw new NullBasketException("Basket can not be null.");
        }

        if (basket.getStorage() == null) {
            throw new NullStorageException("Storage can not be null.");
        }

        if (color == null) {
            throw new NullColorException("Color can not be null.");
        }

        int ballsCount = 0;

        for (Ball ball : basket.getStorage()) {
            if (ball.getColor() == color) {
                ballsCount++;
            }
        }

        return ballsCount;
    }
}