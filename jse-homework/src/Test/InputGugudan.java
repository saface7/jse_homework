package Test;

import java.util.Scanner;

public class InputGugudan {
	/*
	 * 단수를 입력받아서 구구단을 출력함
	 * 예를들어 2를 입력하면 2*1 ~ 2*9 = 18
	 * 단, 입력값이 0 또는 음수는 불허
	 * for loop
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int a = scanner.nextInt();
		int b = 0;
		
		if (a==0 || a<0 ) {
			System.out.println("잘못입력했습니다");
		} else {
			for (int i = 1 ; i <= 9; i++) {
				b = a*i;
				System.out.println(a + "*" + i + "=" + b);
			}

		}
	}
}
