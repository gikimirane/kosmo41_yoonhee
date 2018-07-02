import java.util.Scanner;

public class ThreeByThree
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String[][] arr =  { {"1, 2, 3"},
		                    {"4, 5, 6"},
		                    {"7, x, 8"} };
		int[][] arr2 = new int [3][3];
		String str = null;		
//		ShuffleQuestion();
//		arrPrint();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
/////////////////////////////////////////////////////////////////////////////
		
		System.out.println("[ Move ] a:Left s:Right w:Up z:Down");
		System.out.println("이동키를 입력하세요 : a");
		
		int a = 0;
		for(int i=0, j=2; j>=0; j--)
		{
			System.out.print(arr[i][j] + "\t");
		}

/////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("정답입니다. 게임을 종료합니다.");
		
		System.out.println("[ Exit ] k:Exit");
		str = s.nextLine();
		if(str.equalsIgnoreCase("k")) 
		{
			System.out.println("Good Bye~");
		}
	}
}