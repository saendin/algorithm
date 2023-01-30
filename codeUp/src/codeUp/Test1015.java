package codeUp;

import java.util.Scanner;

public class Test1015 {
	/**
	 * #1015
	 * 실수 입력받아 반올림하여 둘째자리까지 출력하기
	 * ex) 234.255 -> 234.26
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		System.out.printf("%.2f", x);//소숫점 2자리
		
		sc.close();
}
}
