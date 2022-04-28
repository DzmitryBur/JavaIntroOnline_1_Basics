package by.javaonline.basic1.task;

import java.util.Scanner;

public class Branching3 {

	public static void main(String[] args) {
		// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 
 		// Для решения данной задачи будет использовано каноническое уравнение прямой: (х-х1)/(x2-x1) = (y-y1)/(y2-y1) 
		// или, в шашем случае: ((х3-х1)/(x2-x1)) - ((y3-y1)/(y2-y1)) = 0
		
		Scanner coord = new Scanner(System.in);
		
		System.out.print("Enter coordinate x1 (A point): ");
		double x1 = coord.nextDouble();
		
		System.out.print("Enter coordinate y1 (A point): ");
		double y1 = coord.nextDouble();
		
		System.out.print("Enter coordinate x2 (B point): ");
		double x2 = coord.nextDouble();
		
		System.out.print("Enter coordinate y2 (B point): ");
		double y2 = coord.nextDouble();
		
		System.out.print("Enter coordinate x3 (C point): ");
		double x3 = coord.nextDouble();
		
		System.out.print("Enter coordinate y3 (C point): ");
		double y3 = coord.nextDouble();

		if (((x3 - x1) / (x2 - x1)) - ((y3 - y1) / (y2 - y1)) == 0) {
			System.out.println("Points A, B and C are located on the same straight line");
		} else {
			System.out.println("Points A, B and C are NOT located on the same straight line");
		}

	}

}
