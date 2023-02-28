package my.les.on.vw;

public class Task03 {

	public static void main(String[] args) {
		// Накопление сумм произведений

		double x = 0.5;
		double n = 20;
		double y;
		double k = 1;

		double sum = 0;

		for (k = 1; k <= n; k++) {

			sum = sum + ((Math.sin((k * x) / 2.0)) + (Math.sin((k * x - 1) / 2.0))) / (Math.pow(Math.E, x - 1.0 / k));
		}

		y = Math.sqrt(n * Math.PI) * sum;

		System.out.println("y = " + y);

	}

}
