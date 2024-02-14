package package1;

public class 배열요소접근2a {

	public static void main(String[] args) {

		/*
		 * double[] results = {7.0, 8.6, 9.0,}; double sum = 0.0; double avg = 0.0;
		 * 
		 * for(int i = 0; i < results.length; i++) { sum += results[i]; } avg = sum /
		 * results.length;
		 */
		// System.out.println("Average is " + avg);

		int[] results = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < results.length; i++) {

			results[i] = results[i] * 2;
		}
		for (int x : results) {
			System.out.println(x);
		}
	}

}