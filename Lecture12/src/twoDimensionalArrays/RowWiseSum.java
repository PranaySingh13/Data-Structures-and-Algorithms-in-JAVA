package twoDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Sample Input 2:
2
2 5 
4 5 3 2 6 
7 5 3 8 9
4 4
1 2 3 4
9 8 7 6
3 4 5 6
-1 1 -10 5

Sample Output 2:
20 32 
10 30 18 -5  
 */
public class RowWiseSum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[][] take2DInput() throws IOException {
		String[] strRowsCols = br.readLine().trim().split("\\s");
		int n_rows = Integer.parseInt(strRowsCols[0]);
		int m_cols = Integer.parseInt(strRowsCols[1]);

		if (n_rows == 0) {
			return new int[0][0];
		}

		int[][] mat = new int[n_rows][m_cols];

		for (int row = 0; row < n_rows; row++) {
			String[] strNums;
			strNums = br.readLine().trim().split("\\s");

			for (int col = 0; col < m_cols; col++) {
				mat[row][col] = Integer.parseInt(strNums[col]);
			}
		}

		return mat;
	}

	public static void rowWiseSum(int[][] mat) {

		int rows = mat.length;// no. of rows
		int cols = mat[0].length;// no. of columns

		// rows
		for (int i = 0; i < rows; i++) {
			int sum = 0;

			// columns
			for (int j = 0; j < cols; j++) {

				sum = sum + mat[i][j];
			}

			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[][] mat = take2DInput();

			RowWiseSum.rowWiseSum(mat);
			System.out.println();

			t -= 1;
		}
	}

}
