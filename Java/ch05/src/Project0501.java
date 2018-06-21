import java.util.Scanner;

public class Project0501 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		int num = 0;
		int num1;
		do {
			System.out.println("첫 번째 숫자를 입력하세요.");
		
		num1 = s.nextInt();
		num = num1 + num;
		
		} while(num1 != 0);
		
		System.out.println("입력한 정수를 더한 결과: " + (num));
		
	
	}

}
