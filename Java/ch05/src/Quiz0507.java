// �л��� ���� ��ü ��������� ���� ������ ����ϴ� ���α׷��� �ۼ��϶�.
// ����� ����, ����, ������ ������ ���ʷ� �Է¹��� �� ����� ���� ��
// 90���̻� A, 80���̻� B, 70���̻� C, 50���̻� D, �� �̸��̸� F�� ����Ѵ�.

import java.util.Scanner;
public class Quiz0507
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���.");    
		int num1 = s.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");    
		int num2 = s.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");    
		int num3 = s.nextInt();
		
		System.out.println("��� ���� ���ϸ�? : " + (num1 + num2 + num3) / 3);
		
		int nSum = + (num1 + num2 + num3) / 3;
		
		if (nSum >= 90)
			System.out.println("A");
		if (nSum >= 80)
			System.out.println("B");
		if (nSum >= 70)
			System.out.println("C");
		if (nSum >= 50)
			System.out.println("D");
		if (nSum > 50)
			System.out.println("F");
	}
}