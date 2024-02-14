package package3;

public class Break문과Continue문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i,j");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break; // breaks out of inner loop
				}
				System.out.println(i + ", " + j);

			}
		}
	}

}
