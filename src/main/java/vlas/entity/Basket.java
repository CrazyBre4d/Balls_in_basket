package vlas.entity;

import java.util.*;
import java.util.stream.*;

public class Basket {

    private Ball[] balls;
    private int capacity;

    public Basket() {
        this.balls = new Ball[capacity];
        this.capacity = balls.length;
    }

    public Basket(int capacity) {
        balls = new Ball[capacity];
    }

    public Ball[] getBalls() {
        return balls;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setBalls(Ball[] balls) {
        this.balls = balls;
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
    public void set(int index, Ball value) {
        if (index >= 0 && index < balls.length) {
            balls[index] = value;
        } else {
            throw new IndexOutOfBoundsException("set: No such cell exists");
        }
    }
    public void fullClear() {
        for (int i = 0; i < balls.length; i++) {
            balls[i] = null;
        }
    }

    public List<Ball> sortWithStream(int sortNumber) {
        for (int i = 0; i < balls.length; i++) {
           if (balls[i] == null) {throw new NoSuchElementException("sortWithStream: Fill the array");}
        }

        List<Ball> basket = Arrays.asList(balls);
        List<Ball> sortedBalls = basket.stream()
                .filter(ball -> ball.getDiameter() > sortNumber)
                .collect(Collectors.toList());

        return sortedBalls;
    }
    public double diameterSum(){
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == null) {throw new NoSuchElementException("sortWithStream: Fill the array");}
        }

        List<Ball> basket = Arrays.asList(balls);
        double sum = basket.stream()
                .mapToDouble(Ball::getDiameter)
                .sum();
        return sum;
    }
    public List<Ball> shuffle(){
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == null) {throw new NoSuchElementException("sortWithStream: Fill the array");}
        }

        List<Ball> basket = Arrays.asList(balls);
        Collections.shuffle(basket);
        return basket;
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
