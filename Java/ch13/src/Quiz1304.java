import java.util.Scanner;
//���̰� 10�� �迭�� ������ �� �� 10���� ������ �Է¹޴´�.
//�� Ȧ���� �迭�� �տ��� ���� ä�������� ¦���� �迭�� ���������� ä��������.
//��� ����) �� 10���� ������ �Է��Ͻÿ�.
//1 2 3 4 5 6 7 8 9 10 ���: 1 3 5 7 9 8 6 4 2
public class Quiz1304
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);

		int[] num = new int[10];		
		int oddCnt = 0;
		int evenCnt = 9;
		for(int i=0; i<num.length; i++)
		{
			System.out.println("���ڸ� �Է��ϼ���.");
			int nTmp = s.nextInt();
			if(nTmp % 2 == 0) {
				num[evenCnt] = nTmp;
				evenCnt--;
			} else {		
			}
		}
	}
}