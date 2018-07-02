// 길이가 4 by 4인 int형 배열을 선언하고 순서대로 1, 2, 3 … 정수를 입력하여 초기화하자.
// 그리고 배열의 요소들을 오른쪽 방향으로 90º씩 이동시켜서 그 결과를 출력하는 프로그램을 작성하라.

public class Quiz1310
{
	public static void main(String[] args)
	{
		int[][] arr = { {1, 2, 3, 4},
				        {5, 6, 7, 8},
				        {9, 10, 11, 12},
				        {13, 14, 15, 16} };
		
		//////////////////////////////////
		
		int[][] arr2 = new int [4][4];
		
		
		//원본 출력
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		///////////////////////////////////////////////////////
		

		//arr 출력, 90도 회전출력 - 백업
		for(int j=0; j<arr.length; j++)
		{
			for(int i=3; i>=0; i--)
			{
				System.out.print(arr[i][j] + "\t");
				arr2[j][3-i] = arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		// arr2 출력, 90도 회전
		for(int j=0; j<arr2.length; j++)
		{
			for(int i=3; i>=0; i--)
			{
				System.out.print(arr2[i][j] + "\t");
				arr[j][3-i] = arr2[i][j];
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int j=0; j<arr.length; j++)
		{
			for(int i=3; i>=0; i--)
			{
				System.out.print(arr[i][j] + "\t");
				arr2[j][3-i] = arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int j=0; j<arr.length; j++)
		{
			for(int i=3; i>=0; i--)
			{
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
