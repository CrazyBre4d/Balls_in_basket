package vlas;

import vlas.entity.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main (String[] args )
    {
        try {
        List<Ball> balls = Arrays.asList( new BasketballBall("leather",3,true),
                                          new TennisBall("plastic", 6,"blue"),
                                          new TennisBall("asdasf", 6,"red"));
        balls.stream()
                        .sorted(Comparator.comparing(Ball::getMaterial))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

        } catch (RuntimeException | NoSuchFieldError e) {
            System.out.println(e);
      }
    }
}