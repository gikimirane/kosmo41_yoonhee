import java.util.Scanner;

public class Quiz1305
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�ܾ �Է����ּ���.");
		String word = s.next();

		String[] array_word = new String[word.length()];    // ��Ʈ���� ���� �迭

		for(int i=0;i<array_word.length;i++)    //��Ʈ���� �ѱ��ھ� ���� �迭�� ����
		{
			array_word[i] = Character.toString(word.charAt(i));
		}
		
		int nMax1 =array_word.length;
		int nMax2 =array_word.length/2;    //5���� ���ڴ� 2���� ���ϸ� ��
		
		for(int i=0; i<nMax2; i++) {
			if(!array_word[i].equals(array_word[nMax1-1-i]))
			{
				System.out.println("ȸ���� �ƴմϴ�." + i + " : " + array_word[nMax1-1-i]);
				return;    // Ʋ���� �׳� ��������
			}
		}
		
		System.out.println("ȸ���Դϴ�.");
		
		


	}

}
