import java.util.Scanner;

// �ϳ��� ������ �Է¹޾Ƽ� �� ���� ������ ����ϴ� ���α׷��� �ۼ��϶�. 
// ���� 5�� �Է¹޾Ҵٸ� 25�� ��µǾ�� �Ѵ�.

public class Quiz0302
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		
		num = s.nextInt();
		
		System.out.println(num * num);
	}
}