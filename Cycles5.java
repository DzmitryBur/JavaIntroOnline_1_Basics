package by.javaonline.basic1.task;

import java.util.Scanner;

public class Cycles5 {

	public static void main(String[] args) {
		// 5. Дан числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен 
		// заданному е. Общий член ряда имеет вид: a(n)= 1/2 в степени n + 1/3 в степени n
				
		Scanner el = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = el.nextInt();
		
		System.out.print("Enter e: ");
		double e = el.nextDouble();

		double an;
		double sum = 0;

		for (int i = 1; i <= n; i++) { //принимаем, что начинаем от 1-го элемента ряда
			an = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			if (Math.abs(an) >= e) {
				sum += an;
			}
		}
		System.out.println("Sum of the terms of the series is: " + sum);

	}

}
