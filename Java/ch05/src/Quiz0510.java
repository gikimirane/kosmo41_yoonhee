import java.util.Scanner;

//����ڷκ��� 2���� ������ �Է¹޴´�.
//���� 2�� 6�� �Է¹޾Ҵٸ� 2+3+4+5+6�� ���ϴ� ���α׷��� �ۼ��϶�.
//�� 6�� 2�� �Է¹޴´ٸ� 6+5+4+3+2�� ���ؾ� �Ѵ�.

public class Quiz0510
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("2���� ������ �Է��ϼ���.");    
		int i = s.nextInt();
		int j = s.nextInt();
		int sum = 0;
		
		System.out.println(i);    
		if(i < j)
		{
			for(int a = i+1; a<=j; a++)
				System.out.println(" + "+a);
		} else
		{
			for(int a=i-1; a>=j; a--)
				System.out.println(" + "+a);
		}
	}
}