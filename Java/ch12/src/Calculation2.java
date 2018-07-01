abstract class Calc2
{
	int a;
	int b;
	
	abstract int result();
	
	void printResult()
	{
		System.out.println(result());
	}
	
	void setData(int m, int n)
	{
		a = m;
		b = n;
	}
}

class Plus2 extends Calc2
{
	int result() {return a + b;}
}

class Minus extends Calc2
{
	int result() {return a - b;}
}

public class Calculation2
{
	public static void main(String[] args)
	{
		int x = 54, y = 12;
		
		Calc2 calc1 = new Plus2();
		Calc2 calc2 = new Minus();
		
		calc1.setData(x, y);
		calc2.setData(x, y);
		
		System.out.println(x + "+" + y + "=");
		calc1.printResult();
		
		System.out.println(x + "-" + y + "=");
		calc2.printResult();
	}
}
