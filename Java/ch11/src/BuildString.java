
public class BuildString
{
	public static void main(String[] args)
	{
		StringBuilder stbuf = new StringBuilder("123");
        // ���ڿ� "123"�� ����� �ν��Ͻ��� ����		
		stbuf.append(45678);
		System.out.println(stbuf.toString());    //���ڿ� �����̱�
		
		stbuf.delete(0,2);
		System.out.println(stbuf.toString());    //���ڿ� �Ϻ� ����
		
		stbuf.replace(0,3, "AB");
		System.out.println(stbuf.toString());    //���ڿ� �Ϻ� ��ü
		
		stbuf.reverse();
		System.out.println(stbuf.toString());    //���ڿ� ���� ������
		
		String sub = stbuf.substring(2, 4);    //�Ϻθ� ���ڿ��� ��ȯ
		System.out.println(sub);
	}
}
