// 1부터 100까지 정수중에서 짝수의 합을 구하라. 단 do~while문을 이용하라

public class Quiz0509
{
	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		
		do {
			if(i % 2 == 0)
				sum += i;
			i++;
		}
		while(i <= 100);
		System.out.println(sum);
	}
}
