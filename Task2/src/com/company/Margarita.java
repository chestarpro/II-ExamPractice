package com.company;

public class Margarita extends Pizza {
    private static int idMargarita;
    private boolean isWithMeat;

    public Margarita(){

    }

    public Margarita(int price, int weight, boolean isWithMeat) {
        super(price, weight);
        this.isWithMeat = isWithMeat;
    }

    public static int getIdMargarita() {
        return idMargarita;
    }

    public static void setIdMargarita(int idMargarita) {
        Margarita.idMargarita = idMargarita;
    }

    public boolean isWithMeat() {
        return isWithMeat;
    }

    public void setWithMeat(boolean withMeat) {
        isWithMeat = withMeat;
    }

    @Override
    public void cook() {
        idMargarita++;
        super.cook();
        System.out.println(" | Margarita №" + idMargarita);
    }

    @Override
    public String toString() {
        return String.format("Type pizza: Margarita, weight: %s gram, price: %s som, %s \n",
                getWeight(), getPrice(), this.isWithMeat ? "with meat" : "not with meat");
    }
}
