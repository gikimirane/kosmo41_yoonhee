import java.util.Scanner;

// �ΰ��� ������ �Է¹޾Ƽ� ������ ���� ��°���� ������.
// ��¿�) �ΰ��� ������ �Է��ϼ���.
// 25 4
// 25 ������ 4 �� ���� 6 �Դϴ�.
// 25 ������ 4 �� �������� 1 �Դϴ�.

public class Quiz0303
{
	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);
		
        int num, num1;
		System.out.println("�� ���� ������ �Է��ϼ���.");
		num = s.nextInt();
		num1 = s.nextInt();
		
		System.out.println(num + " ������ " + num1 + " �� ���� " + (num/num1) + " �Դϴ�.");
		System.out.println(num + " ������ " + num1 + " �� �������� " + (num%num1) + " �Դϴ�.");
	}
}