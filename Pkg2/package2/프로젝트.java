package package2;

import java.util.Scanner;

public class 프로젝트 {

	Scanner scanner = new Scanner(System.in);
	String[] dinoNames = new String[10];
	String[] employeeNames = new String[10];
	int[] dinoAges = new int[10];
	int[] dinoWeights = new int[10];
	int dinoCount = 0;
	int employeeCount = 0;

	public static void main(String[] args) {

		프로젝트 main = new 프로젝트();
		main.start();

	}

	public void start() {
		while (true) {
			displayMenu();
			int choice = scanner.nextInt();
			handleMenuChoice(choice);
		}

	}

	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden Assistant!");
		System.out.println("1. Add Dinosaur");
		System.out.println("2. Check Park Hours");
		System.out.println("3. Greet Guest");
		System.out.println("4. Check Visitors Count");
		System.out.println("5. Manage Staff");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}

	public void handleMenuChoice(int choice) {
		switch (choice) {
		case 1:
			addDinoSaur();
			break;

		case 2:
			int time = java.time.LocalDateTime.now().getHour();
			checkParkHours(time);
			break;

		case 3:
			//String visitorName = "Messi";
			//greetGuest(visitorName);
			break;

		case 4:
			int currentVisitors = 200;
			int maxVisitors = 2000;
			CheckVisitorsCount(currentVisitors, maxVisitors);
			break;

		case 5:
			mangeStaff();
			break;

		case 6:
			System.out.println("Exiting..!");
			System.exit(0);

		}
	}

	public void addDinoSaur() {

		if (dinoCount < 10) {
			System.out.print("Enter dino name -->");
			String dinoName = scanner.next();
			dinoNames[dinoCount++] = dinoName;
		} else {
			System.out.println("no enough space for new Dinosaur");
		}
	}

	public void dinoCount() {
		System.out.println();
		System.out.println("직원에게 직업을 부여하시겠습니까? (네/아니요)");
		System.out.println();

	}

	public void mangeStaff() {

		if (employeeCount < 10) {
			System.out.print("Enter-->");
			String employeeName = scanner.next();
			employeeNames[employeeCount++] = employeeName;
		} else {
			System.out.println("no ...--");
		}
	}

	public void checkParkHours(int time) {
		if (time >= 8 && time <= 18) {
			System.out.println("현재 시간 " + time + "시는 open시간입니다.");
		} else {
			System.out.println("현재 시간" + time + "시는 close시간입니다.");
		}
	}

	public static void CheckVisitorsCount(int currentVisitors, int maxVisitors) {
		if ((currentVisitors) <= maxVisitors) {
			System.out.println("지금은 방문이 가능합니다");
		} else {
			System.out.println("지금은 방문이 불가합니다");
		}

	}

}