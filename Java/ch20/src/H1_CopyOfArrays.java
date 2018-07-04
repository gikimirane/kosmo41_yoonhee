import java.util.Arrays;

public class H1_CopyOfArrays
{
	public static void main(String[] args)
	{
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		//배열 전체를 복사
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
		//세번째 요소까지만 복사
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		for(double d : arCpy1)
			System.out.print(d + "\t");
		System.out.println();
		
		for(double d : arCpy2)
			System.out.print(d + "\t");
		System.out.println();
	}
}
// Copy of는 새로 만들어서 넣는곡
// arraycopy는 이미 만들어져 있는 배열에 복사한다.
// 두 배열에 저장된 데이터의 수, 순서 그리고 내용이 같을때 true를 반환한다.(배열의 길이가 다를 경우에는 false를 반환)