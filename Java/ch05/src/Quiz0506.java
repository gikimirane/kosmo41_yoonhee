// 사용자로부터 정수 하나를 입력받은 후 그 수에 해당하는 구구단을 역순으로 출력하시오.	
import java.util.Scanner;

public class Quiz0506 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");    //정수 하나를 입력받기
		int nNum = s.nextInt();
		
		for(int i=9; i>1; i = i-1) {    //역순으로 출력하기
			System.out.println(nNum + " x " + i + " = " + (nNum * i));
		}
	}
}