package Test;

import java.util.Scanner;

public class MonthEndDay {
	/*
	 * 월을 입력하면 해당월의 끝날이 몇일인지 출력하는 프로그램
	 * 1을 입력하면 31일
	 * 단 2월은 29일로 통일
	 * 주의점..입력값이 1 ~ 12를 넘어서면 잘못입력
	 * switch..
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = 0;
		month = scanner.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월의 끝날은 31일입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월의 끝날은 30일입니다.");
			break;
		case 2:
			System.out.println(month + "월의 끝날은 29일입니다.");
			break;

		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}

}
