import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz2301 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> kyo = new ArrayList<>();
		List<Integer> cha = new ArrayList<>();
		List<Integer> hap = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		//������, ������, �������� ���Ͻÿ�.
		kyo.addAll(list1);    // list1�� ��� ��Ҹ� kyo�� �����Ѵ�.
		kyo.retainAll(list2);  // list2�� kyo�� ���� ��Ҹ� ����� �����Ѵ�.
		
		cha.addAll(list1);    //char���� list2�� ����� ��ҵ��� ��� �����Ѵ�.
		cha.removeAll(list2);  
		
		hap.addAll(list1);
		hap.removeAll(list2);    //hap���� kyo�� ����� ��� ��Ҹ� �����Ѵ�.
		hap.addAll(list2);    //list2�� ��� ��Ҹ� hap�� �����Ѵ�.
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}
}

// �������� ���ϴ� ���
// �÷��� ��ü�� �̿��ؼ� ���ϴ� ���
// �� �÷��� ��ü�� �޼ҵ带 �̿��ؼ� ���ϴ� ���