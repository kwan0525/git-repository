package package1;

public class switch문과식8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Alison";
		int nLetters = switch (name) {
		case "Jane", "Sean", "Alan", "Paul" -> nLetters = 4;
		case "Janet", "Susan" -> nLetters = 5;
		case "Maaike", "Alison", "Miriam" -> nLetters = 6;

		default -> {
			System.out.println("Unrecognized name: " + name);
			yield -1;
		}
		};
		System.out.println(nLetters);
	}

}
