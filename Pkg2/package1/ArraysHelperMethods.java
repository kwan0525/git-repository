package package1;

import java.util.Arrays;

public class ArraysHelperMethods {
	public static void main(String[] args) {
		int[] results = { 30, 10, 50, 20, 40 };
		// 배열을 스트링 표현으로 변환
		String arrayAsString = Arrays.toString(results);
		System.out.println("Array: " + arrayAsString);
	}
}