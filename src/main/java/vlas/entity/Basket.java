package vlas.entity;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.*;

public class Basket {
    private Ball[] balls;
    private int capacity;

    public Ball[] getBalls() {
        return balls;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    public Basket() {
        this.balls = new Ball[capacity];
        this.capacity = balls.length;
    }

    public Basket(int capacity) {
        balls = new Ball[capacity];
    }
    public void set(int index, Ball value) {
        if (index >= 0 && index < balls.length) {
            balls[index] = value;
        } else {
            throw new IndexOutOfBoundsException("set: No such cell exists");
        }
    }

    public Ball get(int index) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return capacity == basket.capacity && Arrays.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity);
        result = 31 * result + Arrays.hashCode(balls);
        return result;
    }
}
