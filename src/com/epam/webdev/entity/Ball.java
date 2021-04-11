package com.epam.webdev.entity;

import java.io.Serializable;

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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o.getClass() == Ball.class)) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.getWeight(), getWeight()) == 0 &&
                getColor() == ball.getColor();
    }

    @Override
    public int hashCode() {
        int result = (int) (31 * Double.doubleToLongBits(getWeight()) + (getColor() == null ? 0 : getColor().hashCode()));

        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "color=" + color +
                ", weight=" + weight;
    }
}
