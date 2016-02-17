package date;

import java.util.Scanner;import org.omg.Messaging.SyncScopeHelper;

public class DateController {
	public static void main(String[] args) {
		DateService ds = new DateServiceImpl();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			int year = 0;
			int month = 0;
			System.out.println("*** 날짜 프로그램***");
			System.out.println("[메뉴] \n 1. 해당년월의 마지막날 구하기 \n 9.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("해당 년을 입력 후 해당 월을 입력하시오");
				year = scanner.nextInt();
				month = scanner.nextInt();
				System.out.println(year);
				System.out.println(month);
				System.out.println(year + "년" + month + "월의 마지막 날은" + ds.getEndDayOfMonth(year, month) + "입니다");
				break;
			case 9:return;
			default:
				break;
			}
		}
	}
}
