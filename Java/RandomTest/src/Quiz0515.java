import java.util.Random;

public class Quiz0515 {

	public static void main(String[] args) {
		//a * 100 + b * 10 * c
		//a!=b
		//b!=c
		//c!=a
		//if((a != b) && (b != c) && (c != a))
		
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
			//���� ���� ���ϱ�
			num1 = rand.nextInt(10);
			num2 = rand.nextInt(10);
			num3 = rand.nextInt(10);
		}
		// break �԰� ������
		System.out.println(num1 * 100 + num2 * 10 + num3);    //���ڷ� �����
		System.out.println(num1 + "" + num2 + "" + num3);     //���ڷ� �����
	}
	
}
