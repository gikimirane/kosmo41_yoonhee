// 학생의 교내 전체 평균점수에 대한 학점을 출력하는 프로그램을 작성하라.
// 실행시 국어, 영어, 수학의 점수를 차례로 입력받은 후 평균을 구한 후
// 90점이상 A, 80점이상 B, 70점이상 C, 50점이상 D, 그 미만이면 F를 출력한다.

import java.util.Scanner;
public class Quiz0507
{
	public static void main(String[] args)
	{
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