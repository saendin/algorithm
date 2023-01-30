package codeUp;

import java.util.Scanner;

public class Test1024 {
	/**
	#1024
	단어 1개 입력받아 나누어 출력하기
	단어를 1개 입력받는다.
	입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력한다.
	입력 예시 -> Boy
	출력 예시 ->
	'B'
	'o'
	'y'
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한 글자씩 파싱할 문자열을 입력하시오.");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char eachStr = str.charAt(i);
			System.out.println("\'"+eachStr+"\'");
		}
	}
	

}
