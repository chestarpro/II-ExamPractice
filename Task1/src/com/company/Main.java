package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
		Random random = new Random();

		Circle[] circles = new Circle[15];

	    for (int i = 0; i < circles.length; i++) { // Не пойму зачем такие усливия от 1 до 10 радиусы xD Ведь там нету кратных 3 площадей.
	        circles[i] = new Circle(random.nextInt(10 + 1 - 1) + 1); // Я оставил все как в условии заднии. Но проверял от 1 до 1000 все нормально работает.
	        if(circles[i].getArea() % 3 == 0) { // Так для разнообразия сдела :) Тут просто индекс круга вывод с информацией если площадь кратна 3.
				System.out.printf("Circle index[%s]: radius = %s, area = %s \n", i, circles[i].getRadius(), circles[i].getArea());
			}
	    }
        System.out.println("\nThe number of circles whose area is a multiple of three = " + Circle.getCountAreaMultOfThree());
    }
}
