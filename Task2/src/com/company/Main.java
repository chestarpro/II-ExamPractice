package com.company;

public class Main {

    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(2,2, true);
        pepperoni.cook();
        pepperoni.deliver();

        Margarita margarita = new Margarita(3, 3, true);
        margarita.cook();
        margarita.deliver();

        LaFinta laFinta = new LaFinta(4, 5, false);
        laFinta.cook();
        laFinta.deliver();

        Margarita margarita2 = new Margarita(5, 3, false);
        margarita2.cook();
        margarita2.deliver();

        System.out.println(Margarita.getIdPizza());

    }
}
