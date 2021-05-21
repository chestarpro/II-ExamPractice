package com.company;

public class Pepperoni extends Pizza {
    private boolean isSpicy;

    public Pepperoni(){

    }

    public Pepperoni(int price, int weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println(" | (Margarita)");
    }

    @Override
    public String toString() {
        return String.format("Type pizza: Pepperoni, weight: %s gram, price: %s som, %s \n",
                getWeight(), getPrice(), this.isSpicy ? "spicy" : "not spicy");
    }
}
