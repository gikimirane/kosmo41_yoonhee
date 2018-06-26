import java.util.Random;

class MyRandom
{
	void randPrint1()
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Random rand = new Random();
		
		while (true)
		{
			if((num1 != 0) && (num1 != num2) && (num2 != num3) && (num3 != num1))
			{
				break;
			}
			//랜덤 숫자 구하기
			num1 = rand.nextInt(10);
			num2 = rand.nextInt(10);
			num3 = rand.nextInt(10);
		}
		
		System.out.println(num1 * 100 + num2 * 10 + num3);    //숫자로 만들기
		System.out.println(num1 + "" + num2 + "" + num3);
	}
	void randPrint2()
	{
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Random rand = new Random();
		
		while (true)
		{
			if((num1 != num2) && (num2 != num3) && (num3 != num1))
			{
				break;
			}
			
			num = rand.nextInt(900) + 100;
			num1 = num / 100;
			num2 = (num - num1 * 100) / 10;
			num3 = num - num1 * 100 - num2 *10;
		}
		
		System.out.println(num1 * 100 + num2 * 10 + num3);
		System.out.println(num1 + "" + num2 + "" + num3);
	}

}

public class Quiz0515class {
	
	public static void main(String[] args) {
		MyRandom rand = new MyRandom();
		rand.randPrint1();
		System.out.println("-----");
		rand.randPrint2();
	}
}
