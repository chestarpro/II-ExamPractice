package com.company;

public class LaFinta extends Pizza {
    private static int idLaFinta;
    private boolean isWithMushrooms;

    public LaFinta(){

    }

    public LaFinta(int price, int weight, boolean isWithMushrooms) {
        super(price, weight);
        this.isWithMushrooms = isWithMushrooms;
    }

    public static int getIdLaFinta() {
        return idLaFinta;
    }

    public static void setIdLaFinta(int idLaFinta) {
        LaFinta.idLaFinta = idLaFinta;
    }

    public boolean isWithMushrooms() {
        return isWithMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        isWithMushrooms = withMushrooms;
    }

    @Override
    public void cook() {
        idLaFinta++;
        super.cook();
        System.out.println(" | La Finta №" + idLaFinta);
    }

    @Override
    public String toString() {
        return String.format("Type pizza: La Finta, weight: %s gram, price: %s som, %s \n",
                getWeight(), getPrice(), this.isWithMushrooms ? "with mushrooms" : "not with mushrooms");
    }
}
