package com.epam.webdev;

import com.epam.webdev.entity.Ball;
import com.epam.webdev.entity.Basket;
import com.epam.webdev.entity.Color;
import com.epam.webdev.exception.NullBallException;
import com.epam.webdev.exception.NullBasketException;
import com.epam.webdev.exception.NullColorException;
import com.epam.webdev.exception.NullStorageException;
import com.epam.webdev.service.BasketProcessor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws NullBasketException, NullBallException, NullStorageException, NullColorException {
        Basket basket = new Basket(new ArrayList<>());

        Ball firstBlueBall = new Ball(Color.BLUE, 10.0);
        Ball secondBlueBall = new Ball(Color.BLUE, 15.0);
        Ball redBall = new Ball(Color.RED, 5.0);

        basket.addBall(firstBlueBall);
        basket.addBall(secondBlueBall);
        basket.addBall(redBall);

        int amountOfBlueBalls = BasketProcessor.calculateBasketBallsWithColor(basket, Color.BLUE);
        double allBallsWeight = BasketProcessor.calculateAllBasketBallsWeight(basket);

        System.out.println("Amount of blue balls in basket = " + amountOfBlueBalls +
                "\nThe weight of all balls in basket = " + allBallsWeight);
    }
}
