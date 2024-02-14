package package1;

public class dangling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		if (flag)
			if (flag)
				System.out.println("True True");
			else
				System.out.println("True False");

		if (flag) {
			if (flag) {
				System.out.println("True True");
			} else {
				System.out.println("True True");
			}
		}
	}
}