// 두개의 정수를 입력 받아서 두 수의 차를 출력하는 프로그램을 작성하라.
// 단 입력된 두 수의 순서에 상관없이 출력결과는 항상 0 이상이어야 한다.
// 1과2를 입력했다면 1 .... 20과10을 입력했다면 10. 프로그램을 작성해보자.

import java.util.Scanner;

public class Quiz0504 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	    System.out.println("첫 번째 숫자를 입력하세요.");
	    int nNum1 = s.nextInt();
	
	    System.out.println("두 번째 숫자를 입력하세요.");
	    int nNum2 = s.nextInt();
	
	    int nResult = 0;
	    
	    // 만약 nNum1이 더 클 경우에는 "nNum1 - nNum2" 또는 "nNum2 - nNum1" 
	    if (nNum1 > nNum2) {
	    	nResult = nNum1 - nNum2;
	    } else {
	    	nResult = nNum2 - nNum1;
		}
		System.out.println(nResult);
	}
}