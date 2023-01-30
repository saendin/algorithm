package codeUp;

import java.util.Scanner;

public class Test1025 {
	/*
	 * #1025
		정수 1개 입력받아 나누어 출력하기
		다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
		입력 -> 다섯 자리로 이루어진 1개의 정수를 입력받는다.
		(단, 10,000 <= 입력받는 수 <= 99,999 )
		출력 -> 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한 글자씩 파싱할 문자열을 입력하시오.");
		String str = sc.nextLine();
		if(str.length() != 5) {
			System.out.println("(10,000 <= 입력받는 수 <= 99,999 \n범위에 맞는 수를 입력해주세요)");
			return;
		} else {
			char[] numArray = str.toCharArray();
			
			for(char s : numArray) {
				System.out.println("["+s+"]");
			}
		}
	}
}
