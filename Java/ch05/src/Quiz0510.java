import java.util.Scanner;

//사용자로부터 2개의 정수를 입력받는다.
//가령 2와 6을 입력받았다면 2+3+4+5+6을 구하는 프로그램을 작성하라.
//단 6과 2를 입력받는다면 6+5+4+3+2를 구해야 한다.

public class Quiz0510
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력하세요.");    
		int i = s.nextInt();
		int j = s.nextInt();
		int sum = 0;
		
		System.out.println(i);    
		if(i < j)
		{
			for(int a = i+1; a<=j; a++)
				System.out.println(" + "+a);
		} else
		{
			for(int a=i-1; a>=j; a--)
				System.out.println(" + "+a);
		}
	}
}