package com.company;

public class LaFinta extends Pizza {
    private boolean isWithMushrooms;
    private static int countLaFinta;

    public LaFinta(){
        countLaFinta++;
    }

    public LaFinta(double price, double weight, boolean isWithMushrooms) {
        super(price, weight);
        this.isWithMushrooms = isWithMushrooms;

    }

    public boolean isWithMushrooms() {
        return isWithMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        isWithMushrooms = withMushrooms;
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println(" | (La Finta №" + countLaFinta +")");
    }

    @Override
    public String toString() {
        return String.format("Type pizza: La Finta, weight: %s gram, price: %s som, %s \n",
                getWeight(), getPrice(), this.isWithMushrooms ? "with mushrooms" : "not with mushrooms");
    }
}
