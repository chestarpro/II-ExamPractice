package com.company;

public class Circle {
    private int radius;
    final private double PI = 3.14;
    private static int countAreaMultOfThree;

    public Circle(int radius) {
        this.radius = radius;
        if(getArea() % 3 == 0) {
            countAreaMultOfThree++; // Счетчик кругов, площадь которых кратен трем
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static int getCountAreaMultOfThree() {
        return countAreaMultOfThree;
    }

    public double getPI() {
        return PI;
    }

    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }
}
