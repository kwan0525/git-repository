package package2;

public class 연습3 {

	public static void main(String[] args) {

		int[] dinoages = { 1, 2, 3, 4, };
		System.out.println(caLcAverageAge(dinoages));
	}

	public static double caLcAverageAge(int[] ages) {

		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		double averageAge = (double) sum / ages.length;
		return averageAge;

	}

}
