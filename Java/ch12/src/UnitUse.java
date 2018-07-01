abstract class Unit
{
	abstract void attack();
}

class Marine extends Unit
{
	public void attack()
	{
		System.out.println("������ ����");
		System.out.println("���ݷ� 10���� ����");
	}
}

class Zealot extends Unit
{
	public void attack()
	{
		System.out.println("������ ����");
		System.out.println("���ݷ� 8�� ����");
	}
}

class Zergling extends Unit
{
	public void attack()
	{
		System.out.println("������ ����");
		System.out.println("���ݷ� 9���� ����");
	}
}

public class UnitUse
{
	public static void main(String[] args)
	{
		// �׶�
		Unit unit1 = new Marine();
		unit1.attack();
		
		// �����佺
		Unit unit2 = new Zealot();
		unit2.attack();
		
		// �׶�
		Unit unit3 = new Zergling();
		unit3.attack();
	}
}
