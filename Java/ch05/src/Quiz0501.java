import java.util.Scanner;

// 사용자로부터 계속해서 정수를 입력받는다.
// 단 0을 입력받게되면 기존에 입력받은 모든 정수를 더한후 결과를 출력하는 프로그램을 작성하시오.

public class Quiz0501
{
	public static void main(String[] args)
	{		
		int num = 0;
		int num1;
		
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			
			num1 = s.nextInt();
			num = num1 + num;
			
		} while(num1 != 0);
		System.out.println("입력한 정수를 더한 결과: " + (num));	
	}
}