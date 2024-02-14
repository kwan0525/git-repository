package package1;

import java.util.Scanner;

public class switch문과식6 {

	public static void main(String[] args) {
		String name = "Sean";

		int nLetters = switch (name) {
		case "Jane", "Sean", "Alan", "Paul" -> 4;
		case "Janet", "Susan" -> 5;
		case "Maaike", "Alison", "Miriam" -> 6;
		default -> {
			System.out.println("Unrecognized name: " + name);
			yield -1;
		}
		};
		System.out.println(nLetters);

		System.out.println(switch (name) {
		case "Jane", "Sean", "Alan", "Paul" -> 4;
		case "Janet", "Susan" -> 5;
		case "Maaike", "Alison", "Miriam" -> 6;
		default -> ("Unrecognized name: " + name);
		});
	}

}
