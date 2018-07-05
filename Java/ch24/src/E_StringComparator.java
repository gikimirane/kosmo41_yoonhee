import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class strComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}

public class E_StringComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		strComp cmp = new strComp();    // ���İ� Ž���� ����
		Collections.sort(list,cmp);    // ����
		int idx = Collections.binarySearch(list, "Robot", cmp);    //Ž��
		System.out.println(list.get(idx));    //Ž�� ��� ���
	}
}
