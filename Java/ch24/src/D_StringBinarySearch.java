import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D_StringBinarySearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		//����
		Collections.sort(list);
		//Ž��
		int idx = Collections.binarySearch(list,  "RObot");
		//Ž�� ��� ���
		System.out.println(list.get(idx));
	}
}
