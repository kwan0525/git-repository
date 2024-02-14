package package2;

public class 가변인수 {
	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1, 2);
		m1(1, 2, 3);
	}

	public static void m1(int... args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		System.out.println(sum);
	}
}
