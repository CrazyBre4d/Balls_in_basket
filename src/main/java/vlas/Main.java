package vlas;

import vlas.entity.Basket;
import vlas.entity.BasketballBall;
import vlas.entity.TennisBall;

public class Main {
    public static void main (String[] args )
    {
        try {
        Basket basket = new Basket(9);
        BasketballBall basBall = new BasketballBall("sf",3,true);
        TennisBall tenBall = new TennisBall("blue","ff",5.2);

        basket.set(0,basBall);
        basket.set(1,tenBall);

        basBall.blowUp();
        basBall.jump();
        System.out.println(basket);
        } catch (RuntimeException | NoSuchFieldError e) {
            System.out.println(e);
      }

    }
}