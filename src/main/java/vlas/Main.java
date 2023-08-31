package vlas;

import vlas.entity.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main (String[] args )
    {
        try {

            Basket b = new Basket();
            System.out.println(b.get(0));

        } catch (NoSuchElementException | NoSuchFieldError e) {
            System.out.println(e);
      }
    }
}


//методы шаров



