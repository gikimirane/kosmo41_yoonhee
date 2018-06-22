import java.util.Scanner;

public class Quiz0506 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");    //정수 하나를 입력받기
		int nNum = s.nextInt();
		
		for(int i = 9; i > 1; i = i - 1) {     //역순으로 출력하기
				System.out.println(nNum + " x " + i + " = " + (nNum * i));
			
			}
		}

		
	}

