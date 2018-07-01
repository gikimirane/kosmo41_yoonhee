// 배열에 210, 19, 72, 129, 34  순서대로 데이터를 입력하고 데이터를 정렬하시오.

public class Quiz1309
{
	public static void main(String[] args)
	{
		int a[] = { 210, 19, 72, 129, 34 };
		int l = a.length;
		int i, j, k;
		
		System.out.println("정렬 전 데이터 표시: ");
		
		for(i=0; i<1; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println();
//		정렬
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
		System.out.println("정렬 후 데이터 표시: ");
		for(i=0; i<1; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
}