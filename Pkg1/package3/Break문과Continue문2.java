package package3;

public class Break문과Continue문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i, j");
		OUTERLOOP: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break OUTERLOOP; // case sensitive
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("here");
	}

}
