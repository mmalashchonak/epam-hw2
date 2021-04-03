package com.epam.webdev.entity;

import com.epam.webdev.exception.IncorrectWeightException;

import java.io.Serializable;
import java.util.Objects;

public class Ball implements Serializable {

    private Color color;
    private double weight;

    public Ball() {
    }

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws IncorrectWeightException {
        if(weight <= 0){
            throw new IncorrectWeightException();
        }

        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.getWeight(), getWeight()) == 0 &&
                getColor() == ball.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getWeight());
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "color=" + color +
                ", weight=" + weight;
    }
}
