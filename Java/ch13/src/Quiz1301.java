import java.util.Scanner;
//길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
//그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.
public class Quiz1301 {
	
	void PrintMax(int[] arr) {
		int buffer = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[0] < arr[i]) {
				buffer = arr[i];
			}
		}
		System.out.println("최대값 : " + buffer);
	}
	void PrintMin() {
		
	}
	void PrintSum() {
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("13-1 : 최대값, 최소값, 총합 구하기");
		Quiz1301 method = new Quiz1301();
		Scanner scan = new Scanner(System.in);
		int[] arrayNum = new int[5];
		
		for
//		int[] num = new int[5];
//		
//		Scanner s = new Scanner(System.in);
//		
//		for(int i=0; i<5; i++)
//		{
//			System.out.println("100미만의 숫자를 입력하세요.");
//			num[i] = s.nextInt();
//		}
//		
//		int nMax = 0;
//		int nMin = 1000;
//		
//		for(int i=0; i<5; i++)
//		{
//			if(nMax < num[i])
//			{
//				nMax = num[i];
//			}
//			if(nMin > num[i])
//			{
//				nMin = num[i];
//			}
//			System.out.println(nMax + nMin);
//		}		
	}
}
