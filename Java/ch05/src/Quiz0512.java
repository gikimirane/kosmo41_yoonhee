//Do~While���� �̿��Ͽ� 1~1000���� ���ؼ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�������� �Ʒ��Ͱ��� ����Ͻÿ�.
//��)1+2+3.......+1000 = 500500

public class Quiz0512
{
	public static void main(String[] args)
	{
		int i=1;
		int sum=i;
		
		System.out.println(i);
		do {
			i++;
			System.out.println(" + "+i);
			sum += i;
		} while(i<1000);
		System.out.println(" = "+sum);
	}
}
