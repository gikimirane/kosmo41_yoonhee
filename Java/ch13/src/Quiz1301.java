import java.util.Scanner;

public class Quiz1301
{
	public static void main(String[] args)
	{
		int[] num = new int[5];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("100미만의 숫자를 입력하세요.");
			num[i] = s.nextInt();
		}
		
		int nMax = 0;
		int nMin = 1000;
		
		for(int i=0; i<5; i++)
		{
			if(nMax < num[i])
			{
				nMax = num[i];
			}
			if(nMin > num[i])
			{
				nMin = num[i];
			}
			System.out.println(nMax + nMin);
		}		
	}
}
