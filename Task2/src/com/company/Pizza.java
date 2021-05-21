package com.company;

public class Pizza {
    private int price;
    private int weight;
    private static  int idPizza;

    public Pizza(){

    }

    public Pizza(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getIdPizza() {
        return idPizza;
    }

    public void cook() {
        idPizza++;
        System.out.print("Cook pizza №" + idPizza);
    }

    public void deliver() {
        System.out.println("Deliver --> " + toString());
    }
}
