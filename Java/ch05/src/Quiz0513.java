//중첩 for문을 이용하여 구구단 전체를 출력하는 프로그램을 작성하시오.
//단 가로형, 세로형 둘다 만들어야함.

public class Quiz0513
{
	public static void main(String[] args)
	{
		System.out.println("세로형");
		for(int i=2; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				System.out.println(j+"x"+i+"="+j*i+'\t');
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("가로형");
		for(int i=2; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				System.out.println(i+"x"+j+"="+i*j+'\t');
			}
			System.out.println();
		}
	}
}
