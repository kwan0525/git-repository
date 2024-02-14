package package2;

import java.time.LocalDateTime;

public class 연습4 {

	public static void main(String[] args) {
		// int time = LocalDateTime.now().getHour();
		int time = 7;

		// System.out.println(times);
		System.out.println("현재 시간 " + time + "시는 " + openTime(time) + " 입니다.");

	}

	public static String openTime(int time) {
		String opentime = "";
		if (time < 8) {
			opentime = "closed";
		} else if (time >= 8 && time <= 20) {
			opentime = "open";
		} else {
			opentime = "closed";
		}
		return opentime;
	}
}
