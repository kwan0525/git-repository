package package2;

public class 연습1 {

	public static void main(String[] args) {
		String lifeStage = getLifeStage(5);

		System.out.println(lifeStage);
	}

	public static String getLifeStage(int age) {
		String lifeStage = "";
		if ( age < 5) {
			lifeStage = "Hatchling";
		}else if (age >=5 && age <= 15) {
			lifeStage = "Juvenile";
		}else {
			lifeStage = "Adult";
		}
		return lifeStage;
	}
}