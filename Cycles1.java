package by.javaonline.basic1.task;

import java.util.Scanner;

public class Cycles1 {

	public static void main(String[] args) {
		/* 1. Напишите программу, где пользователь вводит любое целое положительное
		 число. А программа суммирует
		 все числа от 1 до введенного пользователем числа. */

		Scanner posnum = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");

		while (!posnum.hasNextInt()) {
			posnum.nextLine();
			System.out.print("Enter a positive integer: ");
		}

		int x;
		x = posnum.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		
		System.out.println("Sum of numbers: " + sum);

	}

}
