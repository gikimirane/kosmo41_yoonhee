// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� ���� ���Ͽ� ����Ѵ�.
// ���� �Է¹޴� ���ڰ� 1�̸��� ���ڶ�� ���Է��� �䱸�ؾ� �Ѵ�.
// �׷��� 1�̻��� ���� 5���� �Է¹޾ƾ� ���α׷��� �ϼ��ȴ�.

import java.util.Scanner;
public class Quiz0508
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		System.out.println("���ڸ� �ټ��� �Է��ϼ���.");
		
		for(int i=0; i<5; i++)
		{
			num = s.nextInt();
			if(num<1)
			{
				System.out.println("�ٽ� �Է��ϼ���.");
				i--;
				continue;
			}
			sum += num;
		}
		System.out.println("�� = " + sum);
	}
}