package vlas;

import vlas.entity.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main (String[] args )
    {
        try {
            Basket basket = new Basket(4);
            basket.set(0,new TennisBall("bok",33.3,"blue"));
            basket.set(1,new TennisBall("jeniya",12,"red"));
            basket.set(2,new TennisBall("vlas",2,"yellow"));
            basket.set(3,new BasketballBall("plastic",15,true));

            System.out.println(basket.shuffle());
           //basket.fullClear();
            System.out.println(basket.sortWithStream(20));
            System.out.println(basket.diameterSum());

        } catch (NoSuchElementException | NoSuchFieldError e) {
            System.out.println(e);
      }
    }
}


//методы шаров



