
public class Quiz1307 {
	//�켱 �Ʒ��� ���� ������ �����迭 A�� �����Ѵ�.
	//�׸��� A�迭�� �ʱⰪ�� �̿��ؼ� �����迭 B�� �ʱ�ȭ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//int num = 0; -> num�� 0���� �ʱ�ȭ�Ѵ�.
	//int arr1[2][4] = {{1,2,3,4},{5.6.7.8}};
	//int arr2[4][2];

	public static void main(String[] args)
	{
//		int[][] arr1 = new int[2][4];
		int[][] arr1 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		
		System.out.println();
		
		
//		int[][] arr2 = new int[4][2];
		int[][] arr2 = {
				{1, 5},
				{2, 6},
				{3, 7},
				{4, 8}
		};
		for(int j=0; j<arr2.length; j++)
		{
			for(int i=0; i<arr2[i].length; i++)
			{
				System.out.print(arr2[j][i] + "\t");
			}
			System.out.println();
	    }
	}
}
