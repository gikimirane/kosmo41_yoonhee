import java.util.Scanner;

// ����ڷκ��� ����ؼ� ������ �Է¹޴´�
// �� 0�� �Է¹ްԵǸ� ������ �Է¹��� ��� ������ ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

public class Quiz0501
{
	public static void main(String[] args)
	{		
		Scanner s = new Scanner(System.in);

		int i;
		int j = 0;

		do {
			System.out.println("���ڸ� �Է��ϼ���.");    // while�� ���ǹ��� ���� ��쿡 ������ ����
			                                       // do-while�� ���� ������ ���� while�� ���ǹ��� ������
			i = s.nextInt();
			j = i + j;
			
		} while (i != 0);    // i�� 0�� �ƴҶ� ������ ���ƶ�� ���̴�
		System.out.println("�Է��� ������ ���� �����" + (j));
	}
}