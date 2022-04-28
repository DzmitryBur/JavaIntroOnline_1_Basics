package by.javaonline.basic1.task;

import java.util.Scanner;

public class Branching4 {

	public static void main(String[] args) {
		// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через 
		// отверстие.
		// Рассмотрим вариант, когда кирпич может принимать в пространсви любое положение,т.е. при прохождении его по двум 
		// координатам в отверстие, но при повороте он не должен пройти, т.е. максимальная "защита от дурака". 
		
		Scanner holeandbrick = new Scanner(System.in);
		
		System.out.print("Enter hole size (a): ");
		double a = holeandbrick.nextDouble();
		
		System.out.print("Enter hole size (b): ");
		double b = holeandbrick.nextDouble();

		System.out.print("Enter brick size (x): ");
		double x = holeandbrick.nextDouble();
		
		System.out.print("Enter brick size (y): ");
		double y = holeandbrick.nextDouble();
		
		System.out.print("Enter brick size (z): ");
		double z = holeandbrick.nextDouble();

		if ((a >= x && a >= y && a >= z) && (b >= x && b >= y && b >= z)) {
			System.out.println("This brick will be able to fit into a hole with the specified dimensions");
		} else {
			System.out.println("This brick will NOT be able to fit into a hole with the specified dimensions");
		}
		
	}
}