import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Random rand = new Random();
		System.out.println("���� ���� 0���� 100 ������ �� �߿� �ϳ��� �����ϰڽ��ϴ�.");
		System.out.println("����� �� ���ڸ� 6ȸ �ȿ� ���߽ø� �˴ϴ�.");

		int com = rand.nextInt(100);
		System.out.println("computer : " + com);
		
		while (true) {
			
			for (int i = 6; i > 0; i--) {
				System.out.println("���̶�� �����մϱ�?");
				int user = s.nextInt();

				if (com > user) {
					System.out.println(user + "�� ���� ���� ���ں��� Ů�ϴ�.");
				}

				if (com < user) {
					System.out.println(user + "�� ���� ���� ���ں��� �۽��ϴ�.");
				}

				if (com == user) {
					System.out.println(user + "�� �����Դϴ�. �����մϴ�!");
					break;

				}
			}
				break;
				System.out.println("����Ǿ����ϴ�. �ٽ� �Ͻðڽ��ϱ�? (y,n)");
				
				String s = s.nextLine();
				if()
				}
			}
		}
