public class A_UseWrapperClass {
	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Integer iInst = new Integer(3); // ���� 3���� ä���� ���� �ν��Ͻ� ����
		showData(iInst);
		showData(new Double(7.15));
	}
}