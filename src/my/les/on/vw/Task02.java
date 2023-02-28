package my.les.on.vw;

public class Task02 {

	public static void main(String[] args) {
		// Вычисление таблицы значений функции одного аргумента
		// Результаты выдать в виде таблицы, в каждой строке порядковый номер, значение
		// аргумента и значение функции с шестью знаками после запятой.

		double a = 0.5;
		double b = 1.0;
		double n = 10;

		double h = (b - a) / n;
		double y;
		double x;

		System.out.println("---------------------------------");
		System.out.println("|  #  |    x    |       y       |");
		System.out.println("---------------------------------");

		int i = 1;

		for (x = a; x <= b; x = x + h) {

			y = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;

			System.out.printf("|%5d|\t%8.2f|\t%1.6f|\n", i, x, y);
			i++;

		}
		System.out.println("---------------------------------");

	}
}
