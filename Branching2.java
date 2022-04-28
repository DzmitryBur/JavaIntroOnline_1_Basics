package by.javaonline.basic1.task;

import java.util.Scanner;

public class Branching2 {

	public static void main(String[] args) {
		// 2. Найти max{min(a, b), min(c, d)} - решение в ДВУХ вариантах.

		// 2.1 Решение через использование class "Math"

		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a = num.nextDouble();
		
		System.out.print("Enter b: ");
		double b = num.nextDouble();
		
		System.out.print("Enter c: ");
		double c = num.nextDouble();
		
		System.out.print("Enter d: ");
		double d = num.nextDouble();

		double x;
		x = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println("Maximum value from {min(a, b), min(c, d)}: " + x);

		// 2.2 Решение через использование ветвления:

		Scanner num1 = new Scanner(System.in);
		System.out.print("Enter a1: ");
		double a1 = num1.nextDouble();
		
		System.out.print("Enter b1: ");
		double b1 = num1.nextDouble();
		
		System.out.print("Enter c1: ");
		double c1 = num1.nextDouble();
		
		System.out.print("Enter d1: ");
		double d1 = num1.nextDouble();
		
		double x1;
		double y;

		if (a1 < b1) {
			x1 = a1;
		} else {
			x1 = b1;
		}
		if (c1 < d1) {
			y = c1;
		} else {
			y = d1;
		}
		if (x1 > y) {
			System.out.println("Maximum value from {min(a1, b1), min(c1, d1)}: " + x1);
		} else {
			System.out.println("Maximum value from {min(a1, b1), min(c1, d1)}: " + y);
		}

	}

}
