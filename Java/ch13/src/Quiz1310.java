// ���̰� 4 by 4�� int�� �迭�� �����ϰ� ������� 1, 2, 3 �� ������ �Է��Ͽ� �ʱ�ȭ����.
// �׸��� �迭�� ��ҵ��� ������ �������� 90���� �̵����Ѽ� �� ����� ����ϴ� ���α׷��� �ۼ��϶�.

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
		
		
		//���� ���
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
		

		//arr ���, 90�� ȸ����� - ���
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
		
		
		
		// arr2 ���, 90�� ȸ��
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
