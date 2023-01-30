package codeUp;

import java.util.Scanner;

public class Test1031 {
	/*
	#1031
	10진 정수 1개 입력받아 8진수로 출력하기
	10진수를 입력받아 8진수(octal)로 출력해보자.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String octal = Integer.toOctalString(n);
        
        System.out.println(octal);
        
        String hex = Integer.toHexString(n);
        System.out.println(hex);
        
        System.out.printf("%h%n",n);
        
        System.out.printf("%X",n);
    }
}
