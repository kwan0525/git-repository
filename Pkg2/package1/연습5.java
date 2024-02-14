package package1;

import java.util.Arrays;

public class 연습5 {

	public static void main(String[] args) {
		String[] dinoNames = { "Tyrannosaurus Rex", "Giganotosaurus", "Velociraptor", "Allosaurus", "Pyroraptor" };
		int[] dinoages = {4,8,12,16,20};
		int target = 8;	
		int index = Arrays.binarySearch(dinoages, target);
		System.out.println("" + target + "" 
			+	"  " + "입니다.");
	}

}
