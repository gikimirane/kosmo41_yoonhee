// ����ڷκ��� ���� �ϳ��� �Է¹��� �� �� ���� �ش��ϴ� �������� �������� ����Ͻÿ�.	
import java.util.Scanner;

public class Quiz0506 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");    //���� �ϳ��� �Է¹ޱ�
		int nNum = s.nextInt();
		
		for(int i=9; i>1; i = i-1) {    //�������� ����ϱ�
			System.out.println(nNum + " x " + i + " = " + (nNum * i));
		}
	}
}