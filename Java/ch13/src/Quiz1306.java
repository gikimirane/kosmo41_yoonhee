	//���ΰ� 9, ���ΰ� 3�� int�� 2���� �迭�� �����Ͽ� ������ �� 2, 3, 4���� �����Ѵ�.
	//�׸��� ����� ������ �Ǿ����� Ȯ���ϱ� ���� ����� �ϴ� ���α׷��� �ۼ��϶�.
public class Quiz1306
{
	public static void main(String[] args)
	{
		int[][] arr2 = new int[3][9];
		int num = 1;
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<9; j++) 
			{
				arr2[i][j] = (i+2) * (j+1);
			}
		}		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<9; j++) 
			{
				System.out.print((i+2) + " x " + (j+1) + " = ");
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
}