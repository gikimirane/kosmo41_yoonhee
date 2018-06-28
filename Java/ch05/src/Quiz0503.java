// 1이상 100미만의 정수중에서 7의배수와 9의배수를 출력하는 프로그램을 작성하라.
// 단, 7의 배수이면서 동시에 9의 배수인 정수는 한번만 출력해야 한다.

public class Quiz0503
{
	public static void main(String[] args)
	{	
		for(int i=1; i<100; i++)     // 1 이상 100 미만의 범위 설정하기.
			if((((i % 7) == 0) || ((i % 9) == 0) ))    // 7의 배수와 9의 배수는 나머지가 0인 것을 찾으면 된다.
			{
				System.out.println(i);
			}
	}
}



// 뭐부터 뭐까지 -> 반복문
// 계속 -> 반복문
// 배수 -> 숫자 %n==0