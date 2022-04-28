package by.javaonline.basic1.task;

public class Cycles8 {

	public static void main(String[] args) {
		// 8. Даны два числа. Определить цифры, входящие в запись как первого, так и
		// второго числа.

		int first = 123456;
		int second = 56789;
		int y;
		int f;

		for (int i = first; i > 0; i /= 10) {
			y = i % 10;
			for (int j = second; j > 0; j /= 10) {
				f = j % 10;
				if (y == f) {
					System.out.print(y);
				}
			}

		}

	}

}
