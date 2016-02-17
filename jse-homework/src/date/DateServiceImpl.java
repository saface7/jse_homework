package date;

import java.util.Scanner;

public class DateServiceImpl implements DateService{
	@Override
	public String getEndDayOfMonth(int year, int month) {
		// 
		//Scanner scanner = new Scanner(System.in);
	//	System.out.println("연도와 월을 입력하세요");
		
		//year = scanner.nextInt();
		//month = scanner.nextInt();
		String result= "";
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = "31일";
			break;
		case 4: case 6: case 9: case 11:
			result = "30일";
			break;
		case 2:
			result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))?"29일" : "28일";
	       //  result = 28;
//	         if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//			  result = 29;
//			}
	         break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
		//System.out.println(month + "월의 끝날은"+ result+ "입니다");
		return result;
	}
}
