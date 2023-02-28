package my.les.on.vw;

public class Task05 {

	public static void main(String[] args) {
		// Вычисление таблицы значений функции одногоаргумента с выбором формулы

		double y;
		double x;

		double a = 1;
		double x1 = -2 * a; 	// начальное значение - начало отрезка значений
		double dx = a / 5.0; 	// шаг

		double n = 12; 			// количество значений

		double xn = (x1 + dx * (n - dx)); 	// конец отрезка значений для n значений

		for (x = x1; x <= xn; x = x + dx) {

			if (x <= 0) {
				y = (a / 2.0) * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));

			} else {
				y = (4 * Math.pow(a, 3)) / (x * x + 4 * a * a);

			}

			System.out.printf("x= %.2f, y=  %.2f\n", x, y);
		}

	}

}
