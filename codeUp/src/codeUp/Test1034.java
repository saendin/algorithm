package codeUp;

import java.util.Scanner;

public class Test1034 {
	/*
	 * #1034 8진 정수 1개 입력받아 10진수로 출력하기 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int n = Integer.parseInt(num, 8);
		System.out.println(n);

		String num2 = sc.nextLine();
		int n2 = Integer.parseInt(num2, 16);
		System.out.printf("%o%n", n2);
	}
}
