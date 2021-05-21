package com.company;

public class Main {

    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(500,700, true);
        pepperoni.cook();
        pepperoni.deliver();

        Margarita margarita = new Margarita(700, 750, true);
        margarita.cook();
        margarita.deliver();

        LaFinta laFinta = new LaFinta(1000, 1200, false);
        laFinta.cook();
        laFinta.deliver();

        Margarita margarita2 = new Margarita(900, 1100, false);
        margarita2.cook();
        margarita2.deliver();
    }
}
