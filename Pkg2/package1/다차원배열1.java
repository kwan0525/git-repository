package package1;

public class 다차원배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 12, 11, 10, 9 }, { 8, 7, 6, 5, }, { 4, 3, 2, 1 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
