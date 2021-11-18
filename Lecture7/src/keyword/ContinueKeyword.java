package keyword;

public class ContinueKeyword {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;//breaks the loop at condition and continue with the next iterations
			}
			System.out.println(i);
		}
	}

}
