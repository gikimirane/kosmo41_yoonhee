import java.util.Random;
import java.util.Scanner;

public class D_BaseBallGame
{
	public static void main(String[] args)
	{
		int com1 = 0;    // �������� �� �ڸ��� ���� �ޱ� ���� ����
		int com2 = 0;
		int com3 = 0;
		
		int user1;    // �Է°��� �� �ڸ��� ���� �ޱ� ���� ����
		int user2;
		int user3;
		
		int i;    // ������ 10ȸ���� ����ϱ����� for���� ����
		
		int x = 0;    // ��Ʈ����ũ ǥ��
		int y = 0;    // ���� ǥ��
		
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		while( com1==com2 || com1==com3 || com2==com3)    //com1, com2, com3 �� ���� �ٸ� ���� �������� ����
		{
			com1 = rand.nextInt(8) + 1;
			com2 = rand.nextInt(8) + 1;
			com3 = rand.nextInt(8) + 1;
		}
		System.out.println("���ڷ� �ϴ� �߱����� �����մϴ�.");
		System.out.println("��ǻ�� ������:" + com1 + com2 + com3);
		
		for(i=0; i<=9; i++)
		{
			x=0;
			y=0;
			
			System.out.println("���ڸ� ���ڸ� �Է��ϼ���.(" + i+1 + "ȸ)");
			int nInput = s.nextInt();
			user1 = nInput / 100;
			user2 = (nInput - user1 * 100) / 10;
			user3 = (nInput - user1 * 100 - user2 *10);
			System.out.println(user1 + ":" + user2 + ":" + user3);
			
			if(user1==com1)
			{
				x++;
			}
			if(user2==com2)
			{
				x++;
			}
			if(user3==com3)
			{
				y++;
			}
			System.out.println(x + " Strike " + y + "Ball");
			
			if(x==3)
			{
				System.out.println("YOU WIN!!!");
				break;
			}
			if(i==9)
			{
				System.out.println("YOU LOSE!!!");
				break;
			}
		}
	}
}
