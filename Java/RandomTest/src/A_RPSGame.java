import java.util.Random;
import java.util.Scanner;

//1,2,3중 하나의 숫자를 난수로 생성한다.
//사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
//승부를 판단하여 출력한다.
//1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려준다.

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
			System.out.println("무엇을 내겠습니까? <1:가위, 2:바위, 3:보  0:종료> :" );
			
			user = s.nextInt();
			com = rand.nextInt(3) + 1;
			
			if(user == 0)
			{
				System.out.println("*** 게임을 종료합니다. ***");
				break;
			}
			
			if(user == 1 && com == 1) System.out.println("사용자 : 가위, 컴퓨터 : 가위\n 비겼습니다.");
			if(user == 1 && com == 3) System.out.println("사용자 : 가위, 컴퓨터 : 보\n 이겼습니다.");
			if(user == 1 && com == 2) System.out.println("사용자 : 가위, 컴퓨터 : 바위\n 졌습니다.");
			
			if(user == 2 && com == 1) System.out.println("사용자 : 바위, 컴퓨터 : 가위\n 이겼습니다.");
			if(user == 2 && com == 2) System.out.println("사용자 : 바위, 컴퓨터 : 보\n 졌습니다.");
			if(user == 2 && com == 3) System.out.println("사용자 : 바위, 컴퓨터 : 바위\n 비겼습니다.");
			
			if(user == 3 && com == 1) System.out.println("사용자 : 보, 컴퓨터 : 가위\n 졌습니다.");
			if(user == 3 && com == 2) System.out.println("사용자 : 보, 컴퓨터 : 보\n 비겼습니다.");
			if(user == 3 && com == 3) System.out.println("사용자 : 보, 컴퓨터 : 바위\n 이겼습니다.");
			
			if(user != 1 && user != 2 && user != 3) System.out.println("<1:가위, 2:바위, 3:보  0:종료> 에서 선택하세요.");
		}
		s.close();
	}
}
