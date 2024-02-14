package package1;

public class switch문과식5 {

	public static void main(String[] args) {

		int nLetters = 0;
		String name = "ㅅ";
		switch (name) {
		case "ㄱ":
		case "ㄴ":
		case "ㄷ":
		case "ㄹ":
			nLetters = 97;
			break;
		case "ㅁ":
		case "ㅂ":
			nLetters = 05;
			break;
		case "ㅅ":
		case "ㅇ":
		case "ㅈ":
			nLetters = 25;
			break;
		default:
			System.out.println("Unrecognized name: " + name);
			nLetters = -1;
			break;

		}
		System.out.println("단어 : " + nLetters);
	}
}