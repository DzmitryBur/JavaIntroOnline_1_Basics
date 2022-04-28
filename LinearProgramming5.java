package by.javaonline.basic1.task;

import java.util.Scanner;

public class LinearProgramming5 {

	public static void main(String[] args) {
		/*
		 * 5. Дано натуральное число Т, которое представляет длительность прошедшего
		 * времени в секундах. Вывести данное значение длительности в часах, минутах и
		 * секундах в следующей форме: ННч ММмин SSc.
		 */

		Scanner sec = new Scanner(System.in);
		System.out.print("Enter a natural number T seconds: ");

		while (!sec.hasNextInt()) {
			sec.nextLine();
			System.out.print("Enter a natural number T seconds: ");
		}

		int t;
		t = sec.nextInt();
		
		int h;
		h = t / 3600;
		
		int m;
		m = (t - (h * 3600)) / 60;
		
		int s;
		s = t - (h * 3600) - (m * 60);

		System.out.println("Time in the format ч., мин., с.: " + h + "ч " + m + "мин " + s + "с");

	}

}
