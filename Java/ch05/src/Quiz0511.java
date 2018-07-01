import java.util.Scanner;

//정수 하나를 입력받은후 그 수의
//팩토리얼 함수의 결과를 출력하는 프로그램을 while문을 이용하여 구현하시오.
//출력예) 입력정수 : 5 5*4*3*2*1 = 120

public class Quiz0511
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int n = sc.nextInt();
		int mul = n;
		
		System.out.println(n);
		for(int i=n-1; i>0; i--)
		{
			System.out.println("*"+i);
			mul = i;
		}
		System.out.println(" = " + mul);
	}
}