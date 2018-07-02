import java.util.Scanner;
public class FinallyCase3
{
	public static void main(String[] args)
	{
		int num;
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		try {
			num = a/b;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(b != 0) {
			num = num + 1;
			}
		}
		System.out.println(num);
	}
}
