package com.epam.webdev.entity;

import com.epam.webdev.exception.IncorrectIndexException;
import com.epam.webdev.exception.NullBallException;
import com.epam.webdev.exception.NullStorageException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {

    private List<Ball> storage;

    public Basket() {
        storage = new ArrayList<>();
    }

    public Basket(List<Ball> storage) {
        this.storage = storage;
    }

    public List<Ball> getStorage() {
        return storage;
    }

    public void setStorage(List<Ball> storage) throws NullStorageException {
        if(storage == null){
            throw new NullStorageException();
        }

        this.storage = storage;
    }

    public void addBall(Ball ball) throws NullBallException {
        if(ball == null) {
            throw new NullBallException();
        }

        storage.add(ball);
    }

    public Ball getBall(int index) throws IncorrectIndexException {
        if(index > storage.size() - 1 || index < 0){
            throw new IncorrectIndexException();
        }

        Ball ball = storage.get(index);

        return ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return getStorage().equals(basket.getStorage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStorage());
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "storage=" + storage;
    }
}
