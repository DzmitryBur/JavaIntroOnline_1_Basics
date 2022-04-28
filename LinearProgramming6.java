package by.javaonline.basic1.task;

import java.util.Scanner;

public class LinearProgramming6 {

	public static void main(String[] args) {
		// 6. Для данной области составить линейную программу, которая печатает true,
		// если точка с координатами (х, у)
		// принадлежит закрашенной области, и false — в противном случае: (приведена
		// графическая фигура с границами:
		// в положительной области оси ординат квадрат с точками диагонали (-2;4) и
		// (2;0),
		// в отрицательной области ординато паралеллограм с точками диагонали (-4;0) и
		// (4;-3)).

		Scanner coord = new Scanner(System.in);
		System.out.print("Enter x coordinate value: ");
		double x;
		x = coord.nextDouble();
		
		System.out.print("Enter y coordinate value: ");
		
		double y;
		y = coord.nextDouble();
		boolean c;
		c = (((x >= -2) && (x <= 2)) && ((y >= 0) && (y <= 4)))
				|| (((x >= -4) && (x <= 4)) && ((y <= 0) && (y >= -3)));
		System.out.println(c);

	}

}
