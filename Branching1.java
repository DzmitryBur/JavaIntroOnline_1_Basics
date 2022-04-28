package by.javaonline.basic1.task;

import java.util.Scanner;

public class Branching1 {

	public static void main(String[] args) {
		// 1. Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли
		// он прямоугольным.

		Scanner other = new Scanner(System.in);
		
		System.out.print("Enter the value of the angle alpha (in degrees): ");
		double alpha = other.nextDouble();
		
		System.out.print("Enter the value of the angle betta (in degrees): ");
		double betta = other.nextDouble();
		
		double gamma;
		gamma = 180 - alpha - betta;
		
		if (gamma < 0 || gamma > 180) {
			System.out.println("Triangle with given angles does not exist.");
		} else if ((gamma >= 0 && gamma <= 180) && (alpha == 90 || betta == 90 || gamma == 90)) {
			System.out.println("The triangle exists and is rectangular.");
		} else {
			System.out.println(
					"Triangle with angels alpha: " + alpha + ", betta " + betta + ", gamma " + gamma + " exists.");
		}

	}

}
