package package2;

public class 연습1a {

	public static void main(String[] args) {
		System.out.println("main: before call to getLifeStage()");
		getLifeStage(5);
		System.out.println("main: after call to getLifeStage()");

	}

	public static void getLifeStage(int age) {
		System.out.println("\tExecuting getLifeStage() method... ");
	}
}
