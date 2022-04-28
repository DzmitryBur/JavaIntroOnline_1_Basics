package by.javaonline.basic1.task;
import java.util.Scanner;

public class LinearProgramming1 {

	public static void main(String[] args) {
		// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

		Scanner i = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a = i.nextDouble();
		
		System.out.print("Enter b: ");
		double b = i.nextDouble();
		
		System.out.print("Enter c: ");
		double c = i.nextDouble();

		double z;
		z = ((a - 3) * b / 2) + c;

		System.out.println("z function value is: " + z);

	}

}
