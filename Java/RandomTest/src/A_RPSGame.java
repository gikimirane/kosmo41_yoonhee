import java.util.Random;
import java.util.Scanner;

//1,2,3�� �ϳ��� ���ڸ� ������ �����Ѵ�.
//����ڰ� ����(1),����(2),��(3) �� �ϳ��� ����.
//�ºθ� �Ǵ��Ͽ� ����Ѵ�.
//1,2,3 �̿��� ���ڸ� �Է��ϸ� �߸��� �Է��� �˷��ش�.

public class A_RPSGame
{
	public static void main(String[] args)
	{
		int user;
		int com;
		
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		while(true)
		{
			System.out.println("������ ���ڽ��ϱ�? <1:����, 2:����, 3:��  0:����> :" );
			
			user = s.nextInt();
			com = rand.nextInt(3) + 1;
			
			if(user == 0)
			{
				System.out.println("*** ������ �����մϴ�. ***");
				break;
			}
			
			if(user == 1 && com == 1) System.out.println("����� : ����, ��ǻ�� : ����\n �����ϴ�.");
			if(user == 1 && com == 3) System.out.println("����� : ����, ��ǻ�� : ��\n �̰���ϴ�.");
			if(user == 1 && com == 2) System.out.println("����� : ����, ��ǻ�� : ����\n �����ϴ�.");
			
			if(user == 2 && com == 1) System.out.println("����� : ����, ��ǻ�� : ����\n �̰���ϴ�.");
			if(user == 2 && com == 2) System.out.println("����� : ����, ��ǻ�� : ��\n �����ϴ�.");
			if(user == 2 && com == 3) System.out.println("����� : ����, ��ǻ�� : ����\n �����ϴ�.");
			
			if(user == 3 && com == 1) System.out.println("����� : ��, ��ǻ�� : ����\n �����ϴ�.");
			if(user == 3 && com == 2) System.out.println("����� : ��, ��ǻ�� : ��\n �����ϴ�.");
			if(user == 3 && com == 3) System.out.println("����� : ��, ��ǻ�� : ����\n �̰���ϴ�.");
			
			if(user != 1 && user != 2 && user != 3) System.out.println("<1:����, 2:����, 3:��  0:����> ���� �����ϼ���.");
		}
		s.close();
	}
}
