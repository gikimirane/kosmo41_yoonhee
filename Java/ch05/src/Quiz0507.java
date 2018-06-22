import java.util.Scanner;

public class Quiz0507 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");    
		int num1 = s.nextInt();
		
		System.out.println("영어 점수를 입력하세요.");    
		int num2 = s.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");    
		int num3 = s.nextInt();
		
		System.out.println("평균 값을 구하면? : " + (num1 + num2 + num3) / 3);
		
		int nSum = + (num1 + num2 + num3) / 3;
		
		if (nSum >= 90)
			System.out.println("A");
		if (nSum >= 80)
			System.out.println("B");
		if (nSum >= 70)
			System.out.println("C");
		if (nSum >= 50)
			System.out.println("D");
		if (nSum > 50)
			System.out.println("F");

	}

}
