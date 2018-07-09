// �Լ��� �������̽� : �߻�޼ҵ尡 �� �ϳ��� �����ϴ� �������̽�

@FunctionalInterface
interface Calculate7 <T> {
	T cal(T a, T b);
}

public class B_LambdaGeneric {
	public static void main(String[] args) {
		Calculate7<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(4, 3));

		Calculate7<Double> cd = (a, b) -> a + b;
		System.out.println(cd.cal(4.32, 3.45));
	}
}
