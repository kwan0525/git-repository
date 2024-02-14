package package1;

import java.util.Scanner;

public class switch문과식7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sean";
		int nLetters = switch (name) {
		case "Jane", "Sean", "Alan", "Paul" -> {
			System.out.println("There are 4 letters in: " + name);
			yield 4;
		}
		case "Janet", "Susan" -> {
			System.out.println("There are 5 letters in: " + name);
			yield 5;
		}
		case "Maaike", "Alison", "Miriam" -> {
			System.out.println("There are 6 letters in: " + name);
			yield 6;
		}
		default -> {
			System.out.println("Unrecognized name: " + name);
			yield -1;
		}
		};
		System.out.println(nLetters);
	}

}
