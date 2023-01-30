package codeUp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test1027 {
	/**
	 * #1027
		년월일 입력 받아 형식 바꿔 출력하기
		년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
		년월일(yyyy.mm.dd)를 입력받아,
		일월년(dd-mm-yyyy)로 출력해보자.
		(단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("yyyy.mm.dd 형식으로 년.월.일을 입력하시오");
		
		String date = sc.nextLine();
		
		String[] strs = date.split("\\."); 
		
		
		Integer[] arr = Stream.of(strs).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

		//output
		System.out.println(Arrays.asList(arr));
		//List<String> list = Arrays.asList(strs) = new ArrayList<String>();대신에 사용.
		//https://m.blog.naver.com/roropoly1/221140156345
		
		System.out.printf("%02d-%02d-%04d", arr[2], arr[1], arr[0]);
		
	}
}
