package package1;

public class 연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yearsExperience = 10;
		String dinosaurType = "T-Rex";

		if (dinosaurType.equals("T-Rex") && yearsExperience < 20) {
			System.out.println("당신은 좀 더 경험이 필요합니다!");
		} else if (dinosaurType.equals("Valicriraptor") && yearsExperience > 5) {
			System.out.println("당신은 Valicriraptor");
		}
	}

}
