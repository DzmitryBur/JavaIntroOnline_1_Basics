package by.javaonline.basic1.task;

import java.util.Scanner;

public class LinearProgramming3 {

	public static void main(String[] args) {
		// 3. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения): (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)∗𝑡𝑔 𝑥𝑦

		Scanner m = new Scanner(System.in);
		
		System.out.print("Enter x value: ");
		double x = m.nextDouble();
		
		System.out.print("Enter y value: ");
		double y = m.nextDouble();

		double z;
		z = ((Math.sin(x) + Math.cos(y)) / (Math.sin(y) + Math.cos(x))) * Math.tan(x * y);

		System.out.println("Value of expression z: " + z);

	}

}
