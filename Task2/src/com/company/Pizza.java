package com.company;

public class Pizza {
    private double price;
    private double weight;

    private static  int idPizza;

    public Pizza(){
    }

    public Pizza(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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
        System.out.println(toString());
    }
}
