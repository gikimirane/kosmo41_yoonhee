import java.math.BigInteger;

public class D1_BigInteger
{
	public static void main(String[] args)
	{
		// long������ ǥ�� ������ ���� ũ�� ���
		System.out.println("�ִ� ����: " + Long.MAX_VALUE);
		System.out.println("�ּ� ����: " + Long.MIN_VALUE);
		System.out.println();
		
		//�ſ� ū ���� BigInteger �ν��Ͻ��� ǥ��
		BigInteger big1 = new BigInteger("1000000000000");
		BigInteger big2 = new BigInteger("-999999999999");
		
		//BigInteger ��� ���� ����
		BigInteger r1 = big1.add(big2);
		System.out.println("���� ���: " + r1);
		
		//BigInteger ��� ���� ����
		BigInteger r2 = big1.multiply(big2);
		System.out.println("���� ���: " + r2);
		System.out.println();
		
		//�ν��Ͻ��� ����� ���� int�� ������ ��ȯ
		int num = r1.intValueExact();
		System.out.println("From BigInteger: " + num);
	}
}
