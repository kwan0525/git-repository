package package1;
import java.util.Arrays;
public class ArrayHelperMethods4 {
	public static void main(String[] args) {
			int[] results = {10,20,30,40,50};
			int[] copiedResults = Arrays.copyOf(results,
			results.length);
			System.out.println(Arrays.toString(copiedResults));
	}
}
