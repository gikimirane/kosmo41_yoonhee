import java.util.Scanner;

// ����ڷκ��� �ΰ��� ������ �Է¹޾Ƽ�
// ��Ģ���꿡 ���� ����� ����ϴ� ���α׷��� �ۼ��϶�.

public class Quiz0301 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i;
		int j;
		
		//�� ���� ������ �Է� �ޱ�
		System.out.println("�� ������ ������ �Է��ϼ���.");
		i = s.nextInt();
		j = s.nextInt();
		
		//��Ģ���꿡 ���� ����� ����ϱ�
		System.out.println("i + j = " + (i + j));
		System.out.println("i - j = " + (i - j));
		System.out.println("i * j = " + (i * j));
		System.out.println("i / j = " + (i / j));
		

	}
}
