package codeUp;

import java.util.Scanner;

public class Test1020 {
	/**
	 * #1020
		주민번호 입력받아 형태 바꿔 출력하기
		입력 -> 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다.
		(입력값은 가상의 주민번호이다.)
		출력 -> '-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String identification = sc.nextLine();
		String[] num = identification.split("-");
		
		
		for(String s : num)
			System.out.print(s);
		
		if(!identification.contains("-")){
			Test1020.wrongNum();
			System.out.println("error code : 1");
			return;
		}
		else if(num[0].length() != 6) {
			Test1020.wrongNum();
			System.out.println("error code : 2");
			return;
		} else if (num[1].length() != 7) {
			Test1020.wrongNum();
			System.out.println("error code : 3");
			return;
		}
	}
	/*
	 * 인터페이스가 자바 표준 라이브러리에 포함되어있는 것을 제외한 나머지 사용자 정의 함수는 
	 * main 메소드 외부에 정의해야한다. 
	 * static 메소드의 경우, main메소드에서 '클래스.메소드명' 으로 사용할 수 있으며 인스턴스 생성이 필요하지 않다.
	 * 그 외의 메소드일경우, 인스턴스를 생성해준 후에 사용할 수 있따.
	 * 객체 생성 후 '객체.메소드명'으로 사용할 수 있따.
	 */
	private static void wrongNum() {
		System.out.println("올바른 번호를 입력해주세요!");
	}
}
