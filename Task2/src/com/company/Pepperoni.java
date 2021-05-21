package com.company;

public class Pepperoni extends Pizza {
    private boolean isSpicy;
    private static  int countPepperoni;

    public Pepperoni(){
        countPepperoni++;
    }

    public Pepperoni(double price, double weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
        countPepperoni++;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    @Override
    public void cook() {
        System.out.println("Cook pizza №"  + getIdPizza() + " | (Margarita №" + countPepperoni +")");
    }

    @Override
    public String toString() {
        return String.format("Type pizza: Pepperoni, weight: %s gram, price: %s som, %s \n",
                getWeight(), getPrice(), this.isSpicy ? "spicy" : "not spicy");
    }
}
