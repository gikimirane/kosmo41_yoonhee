
//���� ���� �����ϴ� ��� A�� Z�� ���ϴ� ���α׷��� �ۼ��϶�
// AZ //0 �����ؼ� 01���� ����
//+ZA
//-----
// 99
// A * 10 + Z
//Z * 10 + A
//��, A�� Z�� ���δٸ� �����̴�.

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
					
