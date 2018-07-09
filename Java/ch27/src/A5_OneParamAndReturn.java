interface HowLong {
	int len(String s);
}

public class A5_OneParamAndReturn {
	public static void main(String[] args) {
		HowLong h1 = s -> s.length();
//		int num = hl.len("I am so happy");    이와 같이 연산 결과가 남는다.
		System.out.println(h1.len("I am so happy"));
	}
}
