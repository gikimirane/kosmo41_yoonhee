import java.util.Scanner;

public class Quiz0506 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");    //정수 하나를 입력받기
		int nNum = s.nextInt();
		
		for(int i = 2; i < 10; i++)    // 그 수에 맞는 구구단을 역순으로 출력하기
		{
			for(int j =0; j <10; j++)
			{
				System.out.println(i + " x " + j + " = " + (i * j));
			
			}
		}

		
	}

}
