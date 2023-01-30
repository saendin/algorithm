package codeUp;

import java.util.Scanner;

public class Test1011 {
	/**
	 * #1011
	 * 문자 1개 입력받아 그대로 출력하기
	 */
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    char x = sc.next().charAt(3);
    System.out.println(x);
    sc.close();
}
}
