interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) { con = s; }
	
	public Printable getPrinter() {
		return new Printer();
	}
	private class Printer implements Printable {
		public void print() {
			System.out.println(con);
		}
	}
}
public class B2_UseMemberInner {
	public static void main(String[] args) {
		Papers p = new Papers("서류 내용: 행복합니다.");
		Printable prn = p.getPrinter();
		prn.print();
	}
}

// 클래스 사용자 입장에서 Printable 인터페이스는 알지만 Printer 쿨래스는 모른다! 알 필요도 없다!
