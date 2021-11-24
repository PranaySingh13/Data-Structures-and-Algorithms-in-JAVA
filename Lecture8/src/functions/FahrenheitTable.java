package functions;

public class FahrenheitTable {
	
	public static void printFahrenheitTable(int start, int end, int step) {
		int cel;
		while (start <= end) {
			cel = ((5 * (start - 32)) / 9);
			System.out.println(start + "\t" + cel);
			start += step;
		}
	}

	public static void main(String[] args) {
		printFahrenheitTable(120, 200, 40);
	}
}
