package package1;

import java.util.Scanner;

public class switch문과식1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sport --> ");
		String sport = sc.next();
		switch (sport) {
		case "Soccer":
			System.out.println("I play Coccer");
			break;
		case "Rugby":
			System.out.println("I play Rugby");
			break;
		default:
			System.out.println("Unknown sport");
			break;
		}

	}

}
