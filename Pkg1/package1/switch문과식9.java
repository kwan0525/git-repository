package package1;

public class switch문과식9 {

	public static void main(String[] args) {
		String name = "Susan";
		int nLetters = switch (name) {
		case "Jane":
		case "Sean":
		case "Alan":
		case "Paul":
			System.out.println("There are 4 letters in: " + name);
			yield 4;
		case "Janet":
		case "Susan":
			System.out.println("There are 5 letters in: " + name);
			yield 5;
		case "Maaike":
		case "Alison":
		case "Miriam":
			System.out.println("There are 6 letters in: " + name);
			yield 6;
		default:
			System.out.println("unrecognized name: " + name);
			yield -1;
		};
		System.out.println(nLetters);

	}

}
