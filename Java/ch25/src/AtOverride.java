interface Viewable1 {
	public void showIt(String str);
}

class Viewer1 implements Viewable1 {
	@Override
	public void showIt(String str) {
		System.out.println(str);
	}
};

public class AtOverride {
	public static void main(String[] args) {
		Viewable1 view = new Viewer1();
		view.showIt("Hello Annotations");
	}
}
// ������̼��� �ڹ� 5���� �Ұ��Ǿ���.