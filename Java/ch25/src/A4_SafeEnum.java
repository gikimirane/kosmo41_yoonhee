enum Animal2 {DOG, CAT}

enum Person2 {MAN, WOMAN}

public class A4_SafeEnum {
	public static void main(String[] args) {
		System.out.println(Animal2.DOG);
		// �������� �޼ҵ� ȣ��
		who(Person2.MAN);            //�޼ҵ� ȣ���� ���������� ����!
		
		//�������� �޼ҵ� ȣ��
//		who(Animal2.DOG);
		
		// ���� : Có�� ���ڷ� ���ϸ� ������ ����.
		// if(Person2.Man == 0) {
	}
	public static void who(Person2 man) {
		switch(man) {
		case MAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		case WOMAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		}
	}
}

//������ �������� �ڷ��� ����ġ�� ���� ���� �߻�
//�� �� ����� Ȯ���� ��������.