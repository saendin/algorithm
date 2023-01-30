package codeUp;

import java.util.Scanner;

public class Test1036 {
	/*
	#1036
	영문자 1개 입력받아 10진수로 출력하기
	영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char transAskii = sc.nextLine().charAt(0);
		System.out.println((int)transAskii);
	}
	
}
