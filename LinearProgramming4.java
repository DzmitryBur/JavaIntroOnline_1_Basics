package by.javaonline.basic1.task;

import java.util.Scanner;

public class LinearProgramming4 {

	public static void main(String[] args) {
		// 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
		// дробную и целую части числа и вывести полученное значение числа.

		Scanner r = new Scanner(System.in);
		System.out.print("Enter a number in the format nnn.ddd: ");

		while (!r.hasNextDouble()) { // эквивалентно while (r.hasNextDouble() == false)
			String s = r.nextLine();
			System.out.print("Enter a number in the format nnn.ddd: ");
		}

		double x;
		x = r.nextDouble();
		
		double y;
		y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println("The resulting value of the number: " + y);

	}

}
