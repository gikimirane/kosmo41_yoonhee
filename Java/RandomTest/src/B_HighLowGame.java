import java.util.Random;
import java.util.Scanner;
public class B_HighLowGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Random rand = new Random();
		
		System.out.println("나는 지금 0부터 100 사이의 값 중에 하나를 생각하겠습니다.");
		System.out.println("당신은 그 숫자를 6회 안에 맞추시면 됩니다.");

		int com = rand.nextInt(100);
//		System.out.println("computer : " + com);		
//		while (true) {
		for (int i=0; i<6; i++) {
//			System.out.println("몇이라고 생각합니까?");
			int user = s.nextInt();

			if (com > user) {
				System.out.println(user + "는 제가 정한 숫자보다 큽니다.");
				}
			if (com < user) {
				System.out.println(user + "는 제가 정한 숫자보다 작습니다.");
				}
			if (com == user) {
				System.out.println(user + "는 정답입니다. 축하합니다!");
				break;
				}
			System.out.println((6-i-1 + "회 남았습니다."));
			}
		System.out.println("종료되었습니다. 다시 하시겠습니까? (y/n) ");
		String str = s.nextLine();
		if(!str.equalsIgnoreCase("y")) {
			System.out.println("Good bye~");
		}
	}
}

