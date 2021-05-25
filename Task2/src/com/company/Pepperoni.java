package com.company;

public class Pepperoni extends Pizza {
    private static int idPepperoni;
    private boolean isSpicy;

    public Pepperoni(){

    }

    public Pepperoni(int price, int weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
    }

    public static int getIdPepperoni() {
        return idPepperoni;
    }

    public static void setIdPepperoni(int idPepperoni) {
        Pepperoni.idPepperoni = idPepperoni;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    @Override
    public void cook() {
        idPepperoni++;
        super.cook();
        System.out.println(" | Pepperoni №" + idPepperoni);
    }

    @Override
    public String toString() {
        return String.format("Type pizza: Pepperoni, weight: %s gram, price: %s som, %s \n",
                getWeight(), getPrice(), this.isSpicy ? "spicy" : "not spicy");
    }
}
