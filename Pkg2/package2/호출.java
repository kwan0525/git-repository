package package2;

public class 호출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 19;
		int[] news = { 1, 2 };
		callByValue(x, news);
		System.out.println(x);
		System.out.println(news[0] + "," + news[1]);
		x = callByValue(x, news);
		System.out.println(x);
	}

	public static int callByValue(int x, int[] news) {
		x = -1;
		news[0] = -1;
		return x;
	}
}
