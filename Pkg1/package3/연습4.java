package package3;

public class 연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dinosaurWeights = { 500, 700, 900, 600, 800 };

		int totalWeight = 0;

		for (int i = 0; i < dinosaurWeights.length; i++) {
			totalWeight += dinosaurWeights[i];
		}
		System.out.println("모든 공룡의 종 무게: " + totalWeight + "kg");

	}

}
