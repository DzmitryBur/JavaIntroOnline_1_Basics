package by.javaonline.basic1.task;

import java.util.Scanner;

public class Branching5 {

	public static void main(String[] args) {
		// 5. Вычислить значение функции: F(x) = x*x-3x+9, если х<=3 и F(x) = 1/(x*x*x+6), если x>3
		
		Scanner ex = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = ex.nextDouble();

		double y;

		if (x <= 3) {
			y = (x * x) - (3 * x) + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("F(x) = " + y);

	}

}
