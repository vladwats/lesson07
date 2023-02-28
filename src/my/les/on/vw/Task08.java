package my.les.on.vw;

public class Task08 {

	public static void main(String[] args) {
		// TODO Сложное условие завершения цикла

		double x;
		double y;

		double x1 = 0.1;
		double dx = 0.1;

		double xn = 10;

		x = x1;

		y = x * x - Math.pow(Math.E, 2 * x) + 4;
		double y1 = y;

		while (x < xn) {
			y = x * x - Math.pow(Math.E, 2 * x) + 4;

			if (y == 0) {
				System.out.println("y=0: (" + x + ", " + y + ")");
				break;

			} else if ((y1 > 0 && y < 0) || (y1 < 0 && y > 0)) {
				System.out.println("Ноль функции пройден: (" + x + ", " + y + ")");
				break;

			} else {
				System.out.println("Ноль функции не был пройден при x= " + x);
			}

			x = x + dx;

		}
	}
}
