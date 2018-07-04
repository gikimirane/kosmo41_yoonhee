import java.util.LinkedList;
import java.util.List;

public class A3_EnhancedForCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>(); // �÷��� �ν��Ͻ� ����

		// �÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// ����� ���ڿ� �ν��Ͻ��� ����
		for (String s : list)
			System.out.println( s  + '\t');
		System.out.println();

		list.remove(0); // ù ��° �ν��Ͻ� ����

		// ù ��° �ν��Ͻ� ���� �� ������ �ν��Ͻ����� ����
		for (String s : list)
			System.out.println( s + '\t');
		System.out.println();

	}

}
