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
		
		int sw=0;
		
		for(int i=0; i<arr.length/2; i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				sw=-1;
				break;
			}
		}
		
		if(sw==0)
			System.out.println("ȸ���Դϴ�.");
		else
			System.out.println("ȸ���� �ƴմϴ�.");


	}

}
