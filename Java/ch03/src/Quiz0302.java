import java.util.Scanner;

// 하나의 정수를 입력받아서 그 수의 제곱을 출력하는 프로그램을 작성하라. 
// 가령 5를 입력받았다면 25가 출력되어야 한다.

public class Quiz0302
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		
		num = s.nextInt();
		
		System.out.println(num * num);
	}
}