import java.util.LinkedList;
import java.util.List;

public class A2_LinkedListCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>(); // �÷��� �ν��Ͻ� ����

		// �÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// ����� ���ڿ� �ν��Ͻ��� ����
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();

		list.remove(0); // ù ��° �ν��Ͻ� ����

		// ù ��° �ν��Ͻ� ���� �� ������ �ν��Ͻ����� ����
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
	}

}
