import java.util.Scanner;

//���� �ϳ��� �Է¹����� �� ����
//���丮�� �Լ��� ����� ����ϴ� ���α׷��� while���� �̿��Ͽ� �����Ͻÿ�.
//��¿�) �Է����� : 5 5*4*3*2*1 = 120

public class Quiz0511
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int n = sc.nextInt();
		int mul = n;
		
		System.out.println(n);
		for(int i=n-1; i>0; i--)
		{
			System.out.println("*"+i);
			mul = i;
		}
		System.out.println(" = " + mul);
	}
}