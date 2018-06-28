import java.util.Scanner;

// 두개의 정수를 입력받아서 다음과 같은 출력결과를 만들어보자.
// 출력예) 두개의 정수를 입력하세요.
// 25 4
// 25 나누기 4 의 몫은 6 입니다.
// 25 나누기 4 의 나머지는 1 입니다.

public class Quiz0303
{
	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);
		
        int num, num1;
		System.out.println("두 개의 정수를 입력하세요.");
		num = s.nextInt();
		num1 = s.nextInt();
		
		System.out.println(num + " 나누기 " + num1 + " 의 몫은 " + (num/num1) + " 입니다.");
		System.out.println(num + " 나누기 " + num1 + " 의 나머지는 " + (num%num1) + " 입니다.");
	}
}