class Apple4
{
	public String toString()
	{
		return "I am an apple.";
	}
}

class Orange4
{
	public String toString()
	{
		return "I am an Orange.";
	}
}

class Box4
{
	private Object ob;
	public void set(Object o)
	{
		ob = o;
	}
	public Object get()
	{
		return ob;
	}
}

public class A4_FruitAndBoxFault2
{
	public static void main(String[] args)
	{
		Box4 aBox = new Box4();
		Box4 oBox = new Box4();
		
		//������ �ڼ��� ���� ���ϱ�?
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}
}
