package vlas;

import vlas.entity.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main (String[] args )
    {
        try {
            Basket basket = new Basket(4);
            basket.add(new TennisBall("bok",33.3,"blue"));
            basket.add(new TennisBall("jeniya",12,"red"));
            basket.add(new TennisBall("vlas",2,"yellow"));
            basket.add(new BasketballBall("plastic",15,true));
            basket.shuffle();
           // basket.fullClear();
            System.out.println(basket);
            basket.sortWithStream(13);
            basket.diameterSum();

        } catch (NoSuchElementException | NoSuchFieldError e) {
            System.out.println(e);
      }
    }
}
// в методы sout не добавлять!
// использовать add кабы все ячейки массива были заполнены! +
//методы шаров
// доделать проверку на исключения


