import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class A5_AsListCollection {
	public static void main(String[] args) {
		// ���ڷ� ���޵� �ν��Ͻ����� ������ �÷��� �ν��Ͻ��� ���� �� ��ȯ
		// �̷��� ������ ����Ʈ �ν��Ͻ��� Immutable �ν��Ͻ��̴�.
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		// list.add("ȫ�浿");
		list = new ArrayList<>(list);
		list.add("����ġ");
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next() + '\t');
		System.out.println();
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			if(itr.next().equals("Box"))
				itr.remove();
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next() + '\t');
		System.out.println();
	}
}
