import java.util.ArrayList;
import java.util.List;
//import java.util.*;  �𸣰����� �� �ҷ�����

public class A1_ArrayListCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // �÷��� �ν��Ͻ� ����

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

// �迭 ��� �ڷᱸ�������� ������ Ȯ�� �� Ȯ���� ArrayList �ν��Ͻ��� ������ ó���Ѵ�.