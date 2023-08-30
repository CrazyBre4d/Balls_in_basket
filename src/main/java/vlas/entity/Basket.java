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

    public Ball[] getBalls() {
        return balls;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    public Basket(int capacity) {
        balls = new Ball[capacity];
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
    public void add(Ball value) { //fix клонирование первого элемента
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == null) {
                balls[i] = value;
                break;
            }
        }
        Ball[] newBall = Arrays.copyOf(balls, balls.length + 1);
        newBall[newBall.length - 1] = value;
        balls = newBall;
    }
    public void fullClear() {
        for (int i = 0; i < balls.length; i++) {
            balls[i] = null;
        }
    }

    public void sortWithStream(int sortNumber){
        List<Ball> basket = Arrays.asList(balls);
        boolean a = basket.isEmpty();
        if (a = true) {
            throw new  NoSuchElementException("sortWithStream: Fill the array");
        }
        basket.stream()
                .filter(ball->ball.getDiameter()>sortNumber).forEach(ball->System.out.printf(String.valueOf(ball))); //"Шары с диаметром ,больше %d: %s ", sortNumber,  //error
    }
    public void diameterSum(){
        List<Ball> basket = Arrays.asList(balls);
        basket.isEmpty();
        if (true) {
            throw new  NoSuchElementException("diameterSum: Fill the array");
        }
        double sum = basket.stream()
                .mapToDouble(Ball::getDiameter)
                .sum();
        System.out.printf("\nСуммарный диаметр: %f",sum);  // УБРАТЬ
    }
    public void shuffle(){
        List<Ball> basket = Arrays.asList(balls);
        if (basket.isEmpty()) {
            throw new  NoSuchElementException("sortWithStream: Fill the array");
        }
        Collections.shuffle(basket);
        System.out.println(basket);
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
