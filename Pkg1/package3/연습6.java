package package3;

import java.util.Scanner;

public class 연습6 {

	public static void main(String[] args) {
		int safeRating = 7;
		int safetyThreshld =14;
		
		do { 
			System.out.println("보안 체크를 진행하겠습니다");
			System.out.println("현재 안전 등급:" + safeRating);
			
			if (safeRating >= safetyThreshld) {
				break;
			}
			System.out.print("보안 체크 (Y/N): ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			
			if(input.equalsIgnoreCase("N")) {
				break;
			}
		}	while (true);
			System.out.println("보안 체크가 완료되었습니다.");
		
}
}
