package package1;

import java.util.Arrays;

public class 프로젝트 {

	public static void main(String[] args) {
				
		String[] dinosaursNames = { "java", "github", "array", "util", "system" };
		System.out.println("공룡들의 이름은 " + Arrays.toString(dinosaursNames) + "가 있습니다");
		
		int[] results = { 100, 200, 300, 400, 500 };
		int target = 100;
		int target1 = 200;
		int target2 = 300;
		int target3 = 400;
		int target4 = 500;
		int index = Arrays.binarySearch(results, target);
		int index1 = Arrays.binarySearch(results, target1);
		int index2 = Arrays.binarySearch(results, target2);
		int index3 = Arrays.binarySearch(results, target3);
		int index4 = Arrays.binarySearch(results, target4);
		
		int[] copiedResults = Arrays.copyOf(results, results.length);
		System.out.println("java의 나이는" + target + "입니다.");
		System.out.println("github의 나이는" + target1 + "입니다.");
		System.out.println("array의 나이는" + target2 + "입니다." );
		System.out.println("공룡들의 나이는 " + Arrays.toString(copiedResults) + "살입니다");
		
		String[] dinosaurspecies = { "Tyrannosaurus Rex", "Giganotosaurus", "Velociraptor", "Allosaurus", "Pyroraptor" };
		System.out.println("공룡들의 " + Arrays.toString(dinosaurspecies) + "종이 있습니다");

		

	}

}
