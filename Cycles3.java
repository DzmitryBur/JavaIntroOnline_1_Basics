package by.javaonline.basic1.task;

public class Cycles3 {

	public static void main(String[] args) {
		// 3. Найти сумму квадратов первых ста чисел.
		
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i * i;
		}

		System.out.print("Sum of squares of first 100 numbers: " + sum);

	}

}
