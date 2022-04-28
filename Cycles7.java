package by.javaonline.basic1.task;

import java.util.Scanner;

public class Cycles7 {

	public static void main(String[] args) {
		// 7. Для каждого натурального числа в промежутке от m до n вывести все
		// делители, кроме единицы и самого числа.
		// m и n вводятся с клавиатуры.

		Scanner ch = new Scanner(System.in);

		System.out.print("Enter m: ");
		int m = ch.nextInt();

		System.out.print("Enter n: ");
		int n = ch.nextInt();

		System.out.println("Divisors excluding '1 (one)' and the natural number itself:");

		for (int i = m; i <= n; i++) {
			System.out.println("for a natural number: " + i);
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("Divider is: " + j);
				}

			}
		}

	}

}
