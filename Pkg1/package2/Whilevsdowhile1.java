package package2;

import java.util.Scanner;

public class Whilevsdowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age --> ");
		int age = sc.nextInt();
		do {
			// 알코올 구매...
			System.out.println("As you are " + age + "years of age," + "you can pirchase alcohol.");
			System.out.println("Please enter your age -->");
			age = sc.nextInt();

		} while (age >= 18);
	}
}
