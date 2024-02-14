package package1;

import java.util.Arrays;

public class 연습4 {

	public static void main(String[] args) {
		String[] Names = {"a", "b", "c", "d", "e"};
		  String[] results = {"a", "c", "e",};
		  for(String result : results) {
		      System.out.println("staff " + result);
		  }
		System.out.print(Arrays.toString(Names));

	}

}
