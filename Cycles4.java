package by.javaonline.basic1.task;

import java.math.BigInteger;

public class Cycles4 {

	public static void main(String[] args) {
		// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
		// Поскольку результат выходит за пределы допустимых значений для типов long и double буду использовать
		// тип BigInteger

		BigInteger sum = BigInteger.valueOf(1); // метод произведения чисел. присвоил 1, т.к. будет участвовать в
												// умножении
		for (int i = 1; i <= 200; i++) {
			sum = sum.multiply(BigInteger.valueOf(i * i)); // метод операции умножения
		}

		System.out.print("Multiplying the squares of first 200 numbers: " + sum); // 750 цифр (разрядов)

	}

}
