import java.util.Scanner;
//�������� ���α׷��� �ۼ��Ѵ�.
//����, ����, ����, ���� 4�����̰� �л��� �̼���, ������, ��������, ���� 4���̴�.
//4 by 4 �迭��  �����ϰ� ����ڷκ��� 4����� 4���� ������ �Է¹޾�
//������ ���·� ���� �����ϰ� ������ ���ϴ� ���α׷��� �ۼ��϶�.
public class Quiz1308
{	
	public static void main(String[] args)
	{
		int[][] nScore = new int[4][6];
		int hsum = 0;
		int[] vsum = new int[4];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<4; i++)
		{
			switch(i) {
			case 0:
				System.out.println("4���� �������� �Է�");
				break;
			case 1:
				System.out.println("4���� �������� �Է�");
				break;
			case 2:
				System.out.println("4���� �������� �Է�");
				break;
			case 3:
				System.out.println("4���� �������� �Է�");
				break;
			default:
				break;
			}
			for(int j=0; j<4; j++)
			{
				nScore[i][j] = s.nextInt();;
			}
			System.out.println();
			
			System.out.println("����\t�̼���\t������\t��������\t����\t����");
			for(int j=0; i<4; i++)
			{
				switch(i) {
				case 0:
					System.out.println("����:\t");
					break;
				case 1:
					System.out.println("����:\t");
					break;
				case 2:
					System.out.println("����:\t");
					break;
				case 3:
					System.out.println("����:\t");
					break;
				default:
					break;
				}
				
				hsum = 0;
				for(int z=0; z<4; z++)
				{
					System.out.println(nScore[i][j] + "\t");
					hsum = hsum + nScore[i][j];
					vsum[i] = vsum[i] + nScore[j][i];
				}
				System.out.println(hsum);
			}
			System.out.print("����\t" + vsum[0] + "\t" + vsum[1] + "\t" + vsum[2] + "\t" + vsum[3] + "\t");
		}
	}
}
	
					


