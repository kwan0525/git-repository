package package1;

import java.util.Arrays;

public class 연습3 {

	public static void main(String[] args) {
		String[] dinoNames = { "Tyrannosaurus Rex", "Giganotosaurus", "Velociraptor", "Allosaurus", "Pyroraptor" };
		int[] dinoweight = { 200, 400, 600, 800, 1000 };
		int target = 200;	
		int index = Arrays.binarySearch(dinoweight, target);
		System.out.println("가장 가벼운 공룡은 " + target + "kg인" 
			+	" Tyrannosaurus Rex " + "입니다.");

	}

}
