import java.util.Scanner;

public class Quiz0506 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");    //���� �ϳ��� �Է¹ޱ�
		int nNum = s.nextInt();
		
		for(int i = 2; i < 10; i++)    // �� ���� �´� �������� �������� ����ϱ�
		{
			for(int j =0; j <10; j++)
			{
				System.out.println(i + " x " + j + " = " + (i * j));
			
			}
		}

		
	}

}
