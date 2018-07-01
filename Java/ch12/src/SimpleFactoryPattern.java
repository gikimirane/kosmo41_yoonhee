abstract class Human
{
	abstract void print();
}

class Man extends Human
{
	String str;
	
	Man(String str)
	{
		this.str = str;
	}
	
	public void print()
	{
		System.out.println(str +" ����1");
		System.out.println(str +" ����2");
	}
}

class Woman extends Human
{
	String str;
	
	Woman(String str)
	{
		this.str = str;
	}
	public void print()
	{
		System.out.println(str +" ����1");
		System.out.println(str +" ����2");
		System.out.println(str +" ����3");
	}
}

class HumanFactory
{
	public static Human create(String str) 
	{
		if(str == "����") {
			return new Man(str);
		} else if(str == "����") {
			return new Woman(str);
		}
		return null;
	}
}
// Man �̳� Woman �̳� Human�� �ڽ� ��ü�̹Ƿ� �θ� ��ü�� ������ �� �ִ�. �����Ͽ� ����

public class SimpleFactoryPattern
{
	public static void main(String[] args)
	{
		Human h1 = HumanFactory.create("����");
		h1.print();
		
		Human h2 = HumanFactory.create("����");
		h2.print();
	}
}

//������ �ְ� �������� �������� �߿����� �ʰ� �� ������ �ΰ� ��ü�� ����Ʈ ��ɸ� �� ���̴�.
//�����̸� ���ھְ� ���� ����� �� ���̰�, �����̸� ���ھְ� ���� ����� �� ���̴�.
//
//�� : ����
//�Ｚ : ������ �о ���� ��
//LG : ������ �о ���� ��
//���� ��ܼ� ���� ��
//
//���� ������ �ڵ��� �ϸ� ��ü�� �ٲ㵵 �� �ڵ�� ������ �ʿ䰡 ����.

