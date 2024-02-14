package package2;

public class 연습2 {

	public static void main(String[] args) {
		double amountoffood = caLcFoodAmout(1000);
		System.out.println(amountoffood);

	}
	public static double caLcFoodAmout (double weight) {
		return weight * 0.005;
	}
}
