public class B3_AutoBoxingUnboxing2
{
	public static void main(String[] args)
	{
		Integer num = 10;
		
		num++;    //new Integer(num.intValue() +1);
		System.out.println(num);    //���� �ڽ̰� ���� ��ڽ� ���ÿ� ����
		
		num += 3;    //new Integer(num.intValue() +3);
		System.out.println(num);
		
		int r = num + 5;
		Integer rObj = num - 5;
		
		System.out.println(r);    //���� ��ڽ� ����
		System.out.println(rObj);
	}
}
