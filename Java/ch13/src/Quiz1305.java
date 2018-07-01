import java.util.Scanner;
//회문(Palindrome)은 앞 or 뒤에서 읽어도 동일한 단어를 뜻한다.
//noon, level 과 같은 단어들이 회문에 속한다.
//사용자로부터 문자열을 입력받은후 회문인지 아닌지 판단하는 프로그램을 작성하시오.
//대소문자까지 동일해야 회문으로 인정함.
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
		
		int nMax1 =array_word.length;
		int nMax2 =array_word.length/2;    //5개의 숫자는 2번만 비교하면 됨
		
		for(int i=0; i<nMax2; i++) {
			if(!array_word[i].equals(array_word[nMax1-1-i]))
			{
				System.out.println("회문이 아닙니다." + i + " : " + array_word[nMax1-1-i]);
				return;    // 틀리면 그냥 빠져나감
			}
		}		
		System.out.println("회문입니다.");
	}
}