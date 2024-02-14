package package1;

public class dangling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if (flag)
		if (flag)
		System.out.println("True True");
		else
		System.out.println("True False");

		if (flag) { if (flag) {
		      System.out.println("True True");
		   }
		   else {
		      System.out.println("True True");
		   }
		}
	}
}