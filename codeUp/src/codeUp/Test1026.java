package codeUp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1026 {
	/**
	 * #1026
			시분초 입력받아 분만 출력하기
			입력되는 시:분:초 에서 분만 출력해보자.
			입력 예시 -> 17:23:57
			출력 예시 -> 23
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// -----------SttringTokenizer
		System.out.println("시간을 입력하시오\n(입력예시  -> 17:23:57)");
		
		String time = sc.nextLine();
		
		StringTokenizer min = new StringTokenizer(time,":");
		
		int[] arr = new int[min.countTokens()]; //토큰 수 만큼 배열공간 만들어 초기화
		
		for(int i=0; min.hasMoreTokens(); i++) { //남은 토큰 수 만큼 for문 돌림
			arr[i] = Integer.parseInt(min.nextToken()); //토큰 끄집어내기
		}
		System.out.println(arr[1]); //분 = index 1


		// -----------split
		String timeArray[] = sc.next().split(":");

		System.out.println(timeArray[1]);

		String[] tokens = time.split(":");
		System.out.println(tokens);

		// -----------시간 for문으로 뽑아내기
		for (String str : tokens)
			System.out.println(str);

	}

	// StringTokenizer로 문자열 파싱
	public static void parsingWithST(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("StringTokenizer로 구분자 끊어내기 놀이. 끊어내는 기준은 .이다 ㅋㅋ. ㅋㅋ.ㅋㅋ.ㅋㅋ");
		String input = sc.nextLine();
		StringTokenizer str = new StringTokenizer(input, ".", true);
		// StringTokenizer str = new StringTokenizer(문자열, 구분자,true/false);
		// 여러개의 구분자도 사용 가능.
		StringTokenizer str2 = new StringTokenizer(input, "-.", true);
		// 구분자 생략할시에는 띄어쓰기로 문자열 구분, 구분자도 토근으로 넣을거면(true) 구분자는 포함시키지 않을거면 false(default)
		System.out.println("토큰 개수: " + str.countTokens());
		// 토큰개수는 객체에서 꺼내쓰는만큼 카운팅 됨.

//			System.out.println("str"+str); -> 주소값으로 표시됨 //strjava.util.StringTokenizer@59a6e353
		System.out.println(str.nextToken());
		System.out.println("토큰 개수: " + str.countTokens());

		int i = 1;
		while (str2.hasMoreTokens()) {
			// str.hasMoreTokens() = 다음 토큰이 있으면 true 없으면 false
			// str.hasMoreElements() 도 비슷한데 해즈모어토큰을 더 많이 씀.
			System.out.println((i++) + "번째 토큰: " + str2.nextToken());
			// nextToken() = 객체에서 다음 토큰을 반환.
		}
		System.out.println("토큰 개수: " + str2.countTokens());
	}

	// split으로 문자열 파싱
	public static void parsingWithSplit(String[] args) {

		// Split으로 문자열 파싱
		Scanner sc = new Scanner(System.in);
		System.out.println("이것은 다음의 문자열을 파싱할 수 있도록 도와줄 것입니다.");
		String input = sc.nextLine();

		String[] strArray = input.split("\\.");

		System.out.println(strArray[0]);

		for (String s : strArray) { // 향상된 포문. 배열 전체를 뽑아서 보여줌.
			System.out.println(s);
		}

		// 내가 입력하는 전화번호에 맞게 -를 붙여주고
		// 거기서 지역번호만 따로 떼어내서 변수에 저장시킬 것.
		System.out.println("지역번호를 붙여 전화번호를 입력하세요.(-로 구분할 것)");
		String tel = sc.nextLine();
//			for(int i=0; i<tel.length(); i++){
//				
//			}
		String areaNum = tel.split("-")[0];
		if (areaNum.equals("053")) {
			System.out.println("대구입니다.");
		} else {
			System.out.println("대구 외의 지역입니다.");
		}
	}
	
	//subString으로 문자열 파싱
	public static void parsingWithSubString(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".부터 자를 문자열을 입력해주세요");
		String str = sc.nextLine();
		String subStringStr = str.substring(0,str.length()-4);
//		String subStringStr = str.substring(str.indexOf("."));
		System.out.println(subStringStr);
	}
}
