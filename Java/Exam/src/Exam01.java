class Calc
{
	int x1;
	int x2;
	
	Calc(int n1, int n2)
	{
		x1 = x1 + n1;
		x2 = x2 + n2;
	}
	
	void Add(int n1, int n2)
	{
		int nResult = n1 + n2;
		System.out.println(n1 + n2);
	}
}

public class Exam01 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		
		Calc myCal = new Calc(num1, num2);
//		int num3 = myCal.Add(num1, num2);
		
//		int num4 = num3 * 10 - 20;
//		System.out.println(num4);
		
//		myCal.Add(num1,  num2);    //num1+num2 �� �����
	}
		
//		System.out.println(num1 + num2);               //��Ģ���� ����ϱ�
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println(num1 / num2);
//		System.out.println(num1 % num2);

//	}

}
