// ����ڷκ��� ���� ������� ������ �Է¹��� �� ����� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��� ������ �Է��� �� ����ڷκ��� �Է¹޴´�.
// �Է¹��� ���ڸ�ŭ ������ �Է¹޴´�.(����1���� 3�̶�� �Է��ߴٸ� 3���� ������ �Է¹޾ƾ� �Ѵ�)
// �Է¹��� ���ڵ��� ��հ��� ���Ͽ� ����Ѵ�.
// ��հ��� �Ҽ��� ���ϱ��� ����ؾ� �Ѵ�.

import java.util.Scanner;
public class Quiz0502
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int nCount = s.nextInt();
		float nSum = 0;
		
		for (int i=0; i < nCount; i++)
		{
			System.out.println("���ڸ� �Է��ϼ���.");
			int nInputNum = s.nextInt();
			nSum = nSum + nInputNum;
		}
		System.out.println(nSum / nCount);
	}
}