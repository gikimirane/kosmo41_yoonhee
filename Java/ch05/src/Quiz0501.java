import java.util.Scanner;

// 사용자로부터 계속해서 정수를 입력받는다
// 단 0을 입력받게되면 기존에 입력받은 모든 정수를 더한후 결과를 출력하는 프로그램을 작성하시오

public class Quiz0501
{
	public static void main(String[] args)
	{		
		Scanner s = new Scanner(System.in);

		int i;
		int j = 0;

		do {
			System.out.println("숫자를 입력하세요.");    // while은 조건문이 참일 경우에 루프를 돈다
			                                       // do-while은 먼저 루프를 돌고 while의 조건문을 만난다
			i = s.nextInt();
			j = i + j;
			
		} while (i != 0);    // i가 0이 아닐때 루프를 돌아라는 뜻이다
		System.out.println("입력한 정수를 더한 결과는" + (j));
	}
}