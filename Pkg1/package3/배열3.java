package package3;

public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 9, 3, 5, 7 };

		System.out.println("[]\t[n]\tHistogram");
		for (int i = 0; i < data.length; i++) {
			System.out.print(i + "\t" + data[i] + "\t");
			for (int j = 1; j <= data[i]; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
}