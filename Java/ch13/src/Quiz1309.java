// �迭�� 210, 19, 72, 129, 34  ������� �����͸� �Է��ϰ� �����͸� �����Ͻÿ�.

public class Quiz1309
{
	public static void main(String[] args)
	{
		int a[] = { 210, 19, 72, 129, 34 };
		int l = a.length;
		int i, j, k;
		
		System.out.println("���� �� ������ ǥ��: ");
		
		for(i=0; i<1; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println();
//		����
		for(j=0; j<1-1; j++)
		{
			for(i = i+1; i<1; i++)
			{
				if(a[j]>a[i])
				{
					k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}
		System.out.println("���� �� ������ ǥ��: ");
		for(i=0; i<1; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
}