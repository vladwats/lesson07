package my.les.on.vw;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// Табулирование функции по сложному условию, для аргумента K в заданном интервале

		int k;
		double y;

		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		int count = 0;

		for (k = -29; k < 60; k++) {

			y = k * k * k - 25 * k * k + 50 * k + 1000;

			if (y > t1 && y < t2) {
				System.out.println(y);
			} else if (y > t3 && y < t4) {
				System.out.println(y);

			} else {
				count += 1;
			}

		}

		System.out.println(count);
	}
}



class Task06_2 {

	public static void main(String[] args) {
		// Табулирование функции по сложному условию, для 20 рандомных значений аргумента K в заданном интервале

		int k;
		double y;

		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		int n = 20;

		int count = 0;
		int i = 0;

		Random rand = new Random();

		while (i <= n) {
			k = rand.nextInt(-30, 60);
			y = k * k * k - 25 * k * k + 50 * k + 1000;

			if (y > t1 && y < t2) {
				System.out.println(y);
			} else if (y > t3 && y < t4) {
				System.out.println(y);

			} else {
				count = count + 1;
			}
			i++;
		}

		System.out.println(count);
	}
}
