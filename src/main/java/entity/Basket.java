package entity;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Basket<T> {
    private T[] balls;
    private int capacity;

    public T[] getBalls() {
        return balls;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setBalls(T[] balls) {
        this.balls = balls;
    }

    public Basket() {
        this.balls = (T[]) new Object[capacity];
        this.capacity = balls.length;
    }

    public Basket(T[] initialArray) {
        balls = (T[]) initialArray;
    }

    public Basket(int capacity) {
        balls = (T[]) new Object[capacity];
    }
    public void set(int index, T value) {
        if (index >= 0 && index < balls.length) {
            balls[index] = value;
        } else {
            throw new IndexOutOfBoundsException("set: No such cell exists");
        }
    }

    public T get(int index) {
        if ((index >= 0 && index < balls.length)) {
            return balls[index];
        } else {
            throw new NoSuchElementException("get: No such cell exists");
        }
    }
    public void remove(int index) {
        if (index >= 0 && index < balls.length) {
            balls[index] = null;
        } else {
            throw new NoSuchElementException("remove: No such cell exists");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + Arrays.toString(balls) +
                ", capacity=" + balls.length +
                '}';
    }
}
