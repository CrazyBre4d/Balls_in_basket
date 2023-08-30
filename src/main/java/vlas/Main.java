package vlas;

import vlas.entity.*;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main (String[] args )
    {
        try {
        Basket basket = new Basket(9);
        BasketballBall basBall = new BasketballBall("b",3,true);
        TennisBall tenBall = new TennisBall("a", 6,"blue");

        List<Ball> balls = Arrays.asList(basBall, tenBall);
        balls.stream()
                        .sorted(Comparator.comparing(Ball::getMaterial))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

        basket.set(0,basBall);
        basket.set(1,tenBall);
        System.out.println(basket);
        //basBall.blowUp();
        basBall.jump();

        } catch (RuntimeException | NoSuchFieldError e) {
            System.out.println(e);
      }

    }
}