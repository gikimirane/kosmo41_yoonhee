import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");           // int nextInt ,byte nextByte
		String str1 = sc.nextLine();             // String nextLine, double nextDouble
		                                         // boolean nextBoolean
		System.out.print("���ڿ� �Է�: ");
		String str2 = sc.nextLine();
		
		System.out.printf("�Էµ� ���ڿ� 1: %s \n", str1);
		System.out.printf("�Էµ� ���ڿ� 2: %s \n", str2);
		
//		System.out.print("123");
//		System.out.print("456");
		

	}

}
