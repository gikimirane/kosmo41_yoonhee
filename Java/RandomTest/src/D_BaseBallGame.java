import java.util.Random;
import java.util.Scanner;

public class D_BaseBallGame
{
	public static void main(String[] args)
	{
		int com1 = 0;    // 랜덤값의 각 자리수 값을 받기 위한 변수
		int com2 = 0;
		int com3 = 0;
		
		int user1;    // 입력값의 각 자리수 값을 받기 위한 변수
		int user2;
		int user3;
		
		int i;    // 게임을 10회까지 계속하기위한 for문용 변수
		
		int x = 0;    // 스트라이크 표시
		int y = 0;    // 볼을 표시
		
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		while( com1==com2 || com1==com3 || com2==com3)    //com1, com2, com3 이 서로 다른 값이 나오도록 설정
		{
			com1 = rand.nextInt(8) + 1;
			com2 = rand.nextInt(8) + 1;
			com3 = rand.nextInt(8) + 1;
		}
		System.out.println("숫자로 하는 야구게임 시작합니다.");
		System.out.println("컴퓨터 랜덤값:" + com1 + com2 + com3);
		
		for(i=0; i<=9; i++)
		{
			x=0;
			y=0;
			
			System.out.println("세자리 숫자를 입력하세요.(" + i+1 + "회)");
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
