import java.util.Arrays;

public class H1_CopyOfArrays
{
	public static void main(String[] args)
	{
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		//�迭 ��ü�� ����
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
		//����° ��ұ����� ����
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		for(double d : arCpy1)
			System.out.print(d + "\t");
		System.out.println();
		
		for(double d : arCpy2)
			System.out.print(d + "\t");
		System.out.println();
	}
}
// Copy of�� ���� ���� �ִ°�
// arraycopy�� �̹� ������� �ִ� �迭�� �����Ѵ�.
// �� �迭�� ����� �������� ��, ���� �׸��� ������ ������ true�� ��ȯ�Ѵ�.(�迭�� ���̰� �ٸ� ��쿡�� false�� ��ȯ)