package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
		Random random = new Random();

		Circle[] circles = new Circle[15];

	    for (int i = 0; i < circles.length; i++) {
	        circles[i] = new Circle(random.nextInt(10 + 1 - 1) + 1);
	        if(circles[i].getArea() % 3 == 0) {
				System.out.printf("Circle index[%s]: radius = %s, area = %s \n", i, circles[i].getRadius(), circles[i].getArea());
			}
	    }

        System.out.println("\nThe number of circles whose area is a multiple of three = " + Circle.getCountAreaMultOfThree());
    }
}
