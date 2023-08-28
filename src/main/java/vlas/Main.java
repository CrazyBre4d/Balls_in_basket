package vlas;

import vlas.entity.Basket;
import vlas.entity.BasketballBall;
import vlas.entity.TennisBall;

public class Main {
    public static void main (String[] args )
    {
        Basket basket = new Basket(9);
        BasketballBall bs = new BasketballBall("sf",3,true);
        basket.set(0,bs);
        TennisBall ball = new TennisBall("blue","ff",5.2);
       basket.set(1,ball);
       bs.blowUp();
        System.out.println(basket);
    }
}