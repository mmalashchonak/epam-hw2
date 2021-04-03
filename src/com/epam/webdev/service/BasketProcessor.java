package com.epam.webdev.service;

import com.epam.webdev.entity.Ball;
import com.epam.webdev.entity.Basket;
import com.epam.webdev.entity.Color;
import com.epam.webdev.exception.NullBasketException;

public class BasketProcessor {

    public static double calculateAllBasketBallsWeight(Basket basket) throws NullBasketException {
        if(basket == null){
            throw new NullBasketException();
        }

        Double ballsWeight = basket.getStorage().stream()
                .map(Ball::getWeight)
                .reduce(Double::sum)
                .orElse(0.0);

        return ballsWeight;
    }

    public static int calculateBasketBallsWithColor(Basket basket, Color color) throws NullBasketException {
        if(basket == null){
            throw new NullBasketException();
        }

        long ballsCount = basket.getStorage().stream()
                .filter(ball -> ball.getColor() == color)
                .count();

        return (int) ballsCount;
    }
}
