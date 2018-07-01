//Do~While문을 이용하여 1~1000까지 더해서 결과를 출력하는 프로그램을 작성하시오.
//실행결과도 아래와같이 출력하시오.
//예)1+2+3.......+1000 = 500500

public class Quiz0512
{
	public static void main(String[] args)
	{
		int i=1;
		int sum=i;
		
		System.out.println(i);
		do {
			i++;
			System.out.println(" + "+i);
			sum += i;
		} while(i<1000);
		System.out.println(" = "+sum);
	}
}
