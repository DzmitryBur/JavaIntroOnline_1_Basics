package by.javaonline.basic1.task;

import java.util.Scanner;

public class Cycles2 {

	public static void main(String[] args) {
		// 2. Вычислить значения функции на отрезке [а,b] c шагом h: y=х, если х>2 и
		// y=-x, если х<=2.

		Scanner equ = new Scanner(System.in);

		System.out.print("Enter (a) border of the segment: ");
		while (!equ.hasNextDouble()) {
			equ.nextLine();
			System.out.print("Enter (a) border of the segment: ");
		}

		double a = equ.nextDouble();

		System.out.print("Enter (b) border of the segment: ");
		while (!equ.hasNextDouble()) {
			equ.nextLine();
			System.out.print("Enter (b) border of the segment: ");
		}

		double b = equ.nextDouble();

		System.out.print("Enter step (h): ");
		while (!equ.hasNextDouble()) {
			equ.nextLine();
			System.out.print("Enter step (h): ");
		}

		double h = equ.nextDouble();

		double y;

		for (double i = a; i <= b; i += h) {
			if (i > 2) {
				y = i;
			} else {
				y = i * -1;
			}
			System.out.printf("y = %.2f; ", y);
		}

	}

}
