
public class Quiz0504 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
	int nNum1 = s.nextInt();
	
	System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
	int nNum2 = s.nextInt();
	
	int nResult = 0;
	if (nNum1 > nNum2) {
		nResult = nNum1 - nNum2;
	}
	else {
		nResult = nNum2 - nNum1;
		}
	
		System.out.println(nResult);
		
	
	}

	}

