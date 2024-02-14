package package2;

public class 연습6a {

	public static void main(String[] args) {

		int currentVisitors = 100;
		int maxVisitors = 1000;
		int cugrop = 100;

		setVisitorCount(currentVisitors, maxVisitors, cugrop);

	}

	public static void setVisitorCount(int currentVisitors, int maxVisitors, int cugrop) {
		System.out.println();
		if ((currentVisitors + cugrop) <= maxVisitors) {
			System.out.println("방문가능");
		} else {
			System.out.println("방문불가");
		}
	}
}