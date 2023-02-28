package my.les.on.vw;

public class Task07 {

	public static void main(String[] args) {
		// Табулирование функции двух переменных

		int n;
		int m;

		double x;
		double z;

		double x1; // x начальный
		double z1; // z начальный

		double hx; // шаг для x
		double hz; // шаг для z

		double y;

		n = 7;
		m = 5;

		x1 = 1.0;
		z1 = 0.5;

		hx = 0.2;
		hz = 0.1;

		double xn = (x1 + hx * (n - hx));    // конец отрезка x значений для n значений
		double zm = (z1 + hz * (m - hz));    // конец отрезка z значений для m значений
		
		// В решении задачи исходил из того, что X и Z изменяются на шаг одновременно,
		// т.к. в решении задачи точно не сказана зависимость изменяемости  X и Z (одновременно, поочередно и т.п)

		for (x = x1, z = z1; x < xn && z < zm; x = x + hx, z = z + hz) {

			y = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);

			System.out.printf("x= %.2f, z= %.2f, y=  %.3f\n", x, z, y);

		}

		// Т.к. в моем случае (описанном выше) получается ситуация, что применяется n=m значений для X и для Z,
		//а по заданнным мной переменным N>M, то несколько значений N для X не учтены. 
		// Исходил из того, что когда достигнуто M значений для Z, значения для Х продолжают изменяться, 
		// а Z остается на последнем своем значении
		
		
		z = z - hz;

		if (n > m) {
			for (x = x1 + (n - (n - m)) * hx; x < xn; x = x + hx) {

				y = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
				System.out.printf("x= %.2f, z= %.2f, y=  %.3f\n", x, z, y);
			}
		}

	}

}
