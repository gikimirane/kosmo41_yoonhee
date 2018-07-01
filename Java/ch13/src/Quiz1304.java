import java.util.Scanner;
//길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받는다.
//단 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.
//출력 예시) 총 10개의 정수를 입력하시오.
//1 2 3 4 5 6 7 8 9 10 결과: 1 3 5 7 9 8 6 4 2
public class Quiz1304
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);

		int[] num = new int[10];		
		int oddCnt = 0;
		int evenCnt = 9;
		for(int i=0; i<num.length; i++)
		{
			System.out.println("숫자를 입력하세요.");
			int nTmp = s.nextInt();
			if(nTmp % 2 == 0) {
				num[evenCnt] = nTmp;
				evenCnt--;
			} else {		
			}
		}
	}
}