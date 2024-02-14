package package1;

public class 사이트1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 모든 조건이 전부 total 변수의 값에 의해서 지배를 받는 상황인데요.

//이런 경우 switch ~ case 문을 사용한다면 코드를 다음과 같이 작성할 수 있습니다.

		int midterm = 40;
		int finalterm = 39;

		int total = midterm + finalterm;

		if (total >= 80)
			System.out.println("A학점 입니다.\n");
		else if (total >= 60)
			System.out.println("B학점 입니다.\n");
		else if (total >= 40)
			System.out.println("C학점 입니다.\n");
		else if (total >= 20)
			System.out.println("D학점 입니다.\n");
		else
			System.out.println("F학점 입니다.\n");

	}

}
