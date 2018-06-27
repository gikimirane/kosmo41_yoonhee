
public class Quiz1307 {
	//우선 아래와 같은 형태의 좌측배열 A를 선언한다.
	//그리고 A배열의 초기값을 이용해서 우측배열 B를 초기화하는 프로그램을 작성하시오.
	//int num = 0; -> num을 0으로 초기화한다.
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
