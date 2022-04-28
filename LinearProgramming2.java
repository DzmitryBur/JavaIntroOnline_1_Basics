package by.javaonline.basic1.task;

import java.util.Scanner;

public class LinearProgramming2 {

	public static void main(String[] args) {
		// 2. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		// 𝑏 + √𝑏2 + 4𝑎𝑐/2𝑎− 𝑎3𝑐 + 𝑏−2

		Scanner n = new Scanner(System.in);

		System.out.print("Enter a: ");
		double a = n.nextDouble();

		System.out.print("Enter b: ");
		double b = n.nextDouble();

		System.out.print("Enter c: ");
		double c = n.nextDouble();

		double x;
		x = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (a * a * a * c) + (1 / (b * b)); 
			
		/* не "перегружаем" два последних выражения в скобках "math.pow"
		*/

		System.out.println("Value of expression x: " + x);
	}

}
