import java.util.Scanner;

// 두개의 정수를 입력받아서 다음과 같은 출력결과를 만들어보자.
// 출력예) 두개의 정수를 입력하세요.
// 25 4
// 25 나누기 4 의 몫은 6 입니다.
// 25 나누기 4 의 나머지는 1 입니다.

public class Quiz0303 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int i;
		int j;

		System.out.println("두 가지의 숫자를 입력하세요.");
		i = s.nextInt();
		j = s.nextInt();

		System.out.println(i + "나누기" + j + "의 몫은 " + (i / j) + "입니다.");
		System.out.println(i + "나누기" + j + "의 나머지는 " + (i % j) + "입니다.");
	}
}