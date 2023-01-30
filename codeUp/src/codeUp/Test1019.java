package codeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1019 {
	/**
	 * #1019
		연월일 입력받아 그대로 출력하기
		년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
		입력 -> 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
		출력 -> 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
		(한 자리 수인 경우 앞에 0을 붙여 출력한다.)
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.");
		String ymd = sc.nextLine();
		StringTokenizer st = new StringTokenizer(ymd, ".");
		int[] arr = new int[st.countTokens()];
		for(int i = 0; st.hasMoreTokens(); i++)
			arr[i] = Integer.parseInt(st.nextToken());
		System.out.printf("%d.%02d.%02d", 2000+arr[0], arr[1], arr[2]);
	}
}
