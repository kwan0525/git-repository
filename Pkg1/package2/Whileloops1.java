package package2;

import java.util.Scanner;

public class Whileloops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		boolean keepGoing = true;

		while (keepGoing) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number (negative number to exit) --> ");

			int n = sc.nextInt();
			if (n < 0) {
				keepGoing = false;
			} else {
				sum = sum + n; // sum +=n
			}

		}
		System.out.println("Sum of numbers is:" + sum);
	}
}
