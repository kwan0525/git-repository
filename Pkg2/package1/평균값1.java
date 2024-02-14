package package1;

import java.util.Arrays;

public class 평균값1 {

	public static void main(String[] args) {
		String[] dinoNames = { "가", "나", "다", "라", "마", "바", "사", "아", "자", "차" };
		int[] dinoages = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		String[] dinosaurspecies = { "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ,", "ㅊ" };
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] weights = {100,200,300,400,500,600,700,800,900,1000};
		
		int agea = 0;
		int weighta = 0;
		
		for(int weight : weights) {
			weighta += weight;
		}
		for(int dinoage : dinoages) {
			agea += dinoage;
		}
	    System.out.println("공룡의 이름은" + Arrays.toString(dinoNames) + "입니다.");
		System.out.println("공룡의 나이는" + Arrays.toString(dinoages) + "입니다.");
		System.out.println("공룡의 종은" + Arrays.toString(dinosaurspecies) + "입니다.");
		System.out.println("공룡의 번호는" + Arrays.toString(number) + "입니다.");
		System.out.println();
		double averageAge =  (double) agea / dinoages.length;
		System.out.println("평균 공룡의 나이는" + averageAge);
		double averweightWeight = (double) weighta / weights.length;
		System.out.println("평균 공룡의 무게는" + averweightWeight);
		
	}

}
