import java.util.Scanner;
public class MindReader
{
	public static void main(String[] args)
	{
		int min = 0;
		int max = 101;
		int avg;
		
		System.out.println("pick a number between 1 and 100");
		System.out.println("If the number is higher than the guess press h");
		System.out.println("If it is less than the guess press 1");
		System.out.println("If my guess is correct press y");
		System.out.println("Is it 50?");
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; (i<8); i++)
		{
			avg = (min + max) / 2;
			System.out.println("당신이 선택한 숫자는" + avg + "입니까?");
			
			String str = s.nextLine();
			
			if(str.equalsIgnoreCase("y"))
			{
				System.out.println("정답입니다. [ " + (i+1) + "회차]");
				break;
			}
			else if(str.equalsIgnoreCase("h"))
			{
				min = avg;
			}
			else if(str.equalsIgnoreCase("l"))
			{
				max = avg;
			}
		}
		System.out.println("Good Bye~");
	}
}