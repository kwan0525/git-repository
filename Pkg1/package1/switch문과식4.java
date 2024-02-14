package package1;

import java.util.Scanner;

public class switch문과식4 {

	public static void main(String[] args) {

		byte b = 12;

		switch (b) {
		case 127:
		case -128:
			System.out.println("ok");
			break;
		// case 128:
		// System.out.println("out of range of byte variable");
		// break;
		case 12:
			System.out.println("ok");
			break;
		default:
			System.out.println("another byte value");

		}
	}
}