import java.util.Scanner;

// �ΰ��� ������ �Է¹޾Ƽ� ������ ���� ��°���� ������.
// ��¿�) �ΰ��� ������ �Է��ϼ���.
// 25 4
// 25 ������ 4 �� ���� 6 �Դϴ�.
// 25 ������ 4 �� �������� 1 �Դϴ�.

public class Quiz0303 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int i;
		int j;

		System.out.println("�� ������ ���ڸ� �Է��ϼ���.");
		i = s.nextInt();
		j = s.nextInt();

		System.out.println(i + "������" + j + "�� ���� " + (i / j) + "�Դϴ�.");
		System.out.println(i + "������" + j + "�� �������� " + (i % j) + "�Դϴ�.");
	}
}