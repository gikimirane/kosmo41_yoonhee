// �ΰ��� ������ �Է� �޾Ƽ� �� ���� ���� ����ϴ� ���α׷��� �ۼ��϶�.
// �� �Էµ� �� ���� ������ ������� ��°���� �׻� 0 �̻��̾�� �Ѵ�.
// 1��2�� �Է��ߴٸ� 1 .... 20��10�� �Է��ߴٸ� 10. ���α׷��� �ۼ��غ���.

import java.util.Scanner;

public class Quiz0504 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	    System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
	    int nNum1 = s.nextInt();
	
	    System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
	    int nNum2 = s.nextInt();
	
	    int nResult = 0;
	    
	    // ���� nNum1�� �� Ŭ ��쿡�� "nNum1 - nNum2" �Ǵ� "nNum2 - nNum1" 
	    if (nNum1 > nNum2) {
	    	nResult = nNum1 - nNum2;
	    } else {
	    	nResult = nNum2 - nNum1;
		}
		System.out.println(nResult);
	}
}