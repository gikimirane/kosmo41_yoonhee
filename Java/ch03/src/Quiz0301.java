import java.util.Scanner;

// 사용자로부터 두개의 정수를 입력받아서
// 사칙연산에 대한 결과를 출력하는 프로그램을 작성하라.

public class Quiz0301 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i;
		int j;
		
		//두 가지 정수를 입력 받기
		System.out.println("두 가지의 정수를 입력하세요.");
		i = s.nextInt();
		j = s.nextInt();
		
		//사칙연산에 대한 결과를 출력하기
		System.out.println("i + j = " + (i + j));
		System.out.println("i - j = " + (i - j));
		System.out.println("i * j = " + (i * j));
		System.out.println("i / j = " + (i / j));
		

	}
}
