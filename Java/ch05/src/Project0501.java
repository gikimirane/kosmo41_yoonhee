import java.util.Scanner;

public class Project0501 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		int num = 0;
		int num1;
		do {
			System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		
		num1 = s.nextInt();
		num = num1 + num;
		
		} while(num1 != 0);
		
		System.out.println("�Է��� ������ ���� ���: " + (num));
		
	
	}

}
