package com.epam.webdev.entity;

import com.epam.webdev.exception.BasketIsEmptyException;
import com.epam.webdev.exception.NullBallException;
import com.epam.webdev.exception.NullStorageException;

import java.util.Iterator;
import java.util.List;

public class Basket {

    private List<Ball> storage;

    @SuppressWarnings("For posssible serialization.")
    public Basket() {
    }

    public Basket(List<Ball> storage) {
        this.storage = storage;
    }

    public List<Ball> getStorage() {
        return storage;
    }

    public void setStorage(List<Ball> storage) {
        this.storage = storage;
    }

    public void addBall(Ball ball) throws NullBallException, NullStorageException {
        if (ball == null) {
            throw new NullBallException("Ball can not be null.");
        }

        if (storage == null) {
            throw new NullStorageException("Storage can not be null.");
        }

        storage.add(ball);
    }

    public Ball getBall() throws BasketIsEmptyException, NullStorageException {

        if (storage == null) {
            throw new NullStorageException("Storage can not be null.");
        }

        Iterator<Ball> iterator = storage.iterator();
        if (iterator.hasNext()) {
            Ball ball = iterator.next();
            iterator.remove();
            return ball;
        }

        throw new BasketIsEmptyException("No balls in basket.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o.getClass() == Basket.class)) return false;
        Basket basket = (Basket) o;
        return getStorage().equals(basket.getStorage());
    }

    @Override
    public int hashCode() {
        if (getStorage() == null)
            return 0;

        int result = 1;

        for (Ball ball : getStorage())
            result = 31 * result + (ball == null ? 0 : ball.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "storage=" + storage;
    }
}
