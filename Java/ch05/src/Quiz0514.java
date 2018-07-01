
//다음 식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성하라
// AZ //0 포함해서 01부터 시작
//+ZA
//-----
// 99
// A * 10 + Z
//Z * 10 + A
//단, A와 Z는 서로다른 숫자이다.

public class Quiz0514 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<100; i++)
		{
			for(int j=0; j<10; j++)
			{
				if (((i*10+j) + (j*10+i)) == 99)
				{
					System.out.println(i + " " + j);
					System.out.println(j + " " + i);
					System.out.println("-----------");
				}
			}
		}
	}
}
		
		
		
//		for(int i=10; i<10; i++)
//		{
//			System.out.println(i*10);
			
//		for(int j=0; j<10; j++)
//		{
//			System.out.println(i*10+j);
//		}
					
