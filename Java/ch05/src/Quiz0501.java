import java.util.Scanner;

// ����ڷκ��� ����ؼ� ������ �Է¹޴´�.
// �� 0�� �Է¹ްԵǸ� ������ �Է¹��� ��� ������ ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Quiz0501
{
	public static void main(String[] args)
	{		
		int num = 0;
		int num1;
		
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���.");
			
			num1 = s.nextInt();
			num = num1 + num;
			
		} while(num1 != 0);
		System.out.println("�Է��� ������ ���� ���: " + (num));	
	}
}