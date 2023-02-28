package my.les.on.vw;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		// Проверка попадания точки в заданную область
		// Подсчитать количество точек, попавших в заданную область.

		int x1 = -2, y1 = 0;
		int x2 = 0, y2 = 2;

		int x3 = 0, y3 = -1;
		int x4 = 2, y4 = 1;

		double x;
		double y;
		int n = 10;

		Random rand = new Random();

		int count = 0;

		int i = 0;

		while (i <= n) {
			x = rand.nextDouble(-5, 5);
			y = rand.nextDouble(-5, 5);

			if ((x >= x1 && x <= x2) && (y >= y1 && y <= y2) || (x >= x3 && x <= x4) && (y >= y3 && y <= y4)) {
				count = count + 1;
				System.out.println("Точка в области:" + "x= " + x + " y= " + y);
				
			} else {
				System.out.println("Точка вне области:" + "x= " + x + " y= " + y);
			}
			i++;
		}
		
		System.out.println("\n");
		System.out.println("Количество точек, попавших в заданную область: " + count);

	}

}
