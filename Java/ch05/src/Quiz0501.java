import java.util.Scanner;

public class Quiz0501 {

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

      //�������
        // int x = 0;
		// int sum = 0;
		// int num1 =1;
		
		// do {
			
			// Scanner s = new Scanner(System.in);
			
			// System.out.println("���ڸ� �Է��ϼ���.");
			// num1 = s.nextInt();
			
			// sum = sum + num1;
			
			// x++;

		// } while (num1 != 0);
		
		// System.out.println("sum : " + sum);
		
				