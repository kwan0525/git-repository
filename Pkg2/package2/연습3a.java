package package2;

public class 연습3a {

	public static void main(String[] args) {
		int[] dinoages = { 15, 20, 25, 30 };

		System.out.println(caLcAverageAge(dinoages));
	}
public static double caLcAverageAge(int[] ages) {
	
	int ageb = 0;
	for (int age : ages) {
		ageb += age;
	}
	
	double averageAge =  (double) ageb / ages.length;
	return averageAge;
	
	}

}

