package package2;

public class 메서드2 {

	public static int performCalc(int x, int y, String operation) {
		int result = switch (operation) {
		case "+" -> x + y;
		case "-" -> x - y;
		case "*" -> x * y;
		case "/" -> x / y;
		case "%" -> x % y;
		default -> {
			System.out.println("Unknown operation:  " + operation);
			yield -1;
		}
		};
		return result;
	}

	public static void main(String[] args) {
		int result = performCalc(10, 2, "+");
		System.out.println(result);
		System.out.println(performCalc(10, 2, "-"));
		System.out.println(performCalc(10, 2, "*"));
		System.out.println(performCalc(10, 2, "/"));
		System.out.println(performCalc(10, 2, "%"));
		performCalc(10, 2, "%");
		System.out.println(performCalc(10, 2, "&)"));

	}

}
