// �������� ����ϵ� ¦���ܸ� ����ϵ��� ���α׷��� �ۼ��϶�.
// ��, 2���� 2*2������, 4���� 4*4������....8���� 8*8������ ����ؾ� �Ѵ�.

public class Quiz0505 {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j =1; j <10; j++) {
				if(j % 2 == 0) {
					System.out.println(i + " x " + j + " = " + (i * j));	
				}
			}
		}
	}
}