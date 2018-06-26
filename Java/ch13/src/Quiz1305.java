import java.util.Scanner;

public class Quiz1305
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("단어를 입력해주세요.");
		String word = s.next();

		String[] array_word = new String[word.length()];    // 스트링을 담을 배열

		for(int i=0;i<array_word.length;i++)    //스트링을 한글자씩 끊어 배열에 저장
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
			System.out.println("회문입니다.");
		else
			System.out.println("회문이 아닙니다.");


	}

}
