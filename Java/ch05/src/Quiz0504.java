
public class Quiz0504 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("첫 번째 숫자를 입력하세요.");
	int nNum1 = s.nextInt();
	
	System.out.println("두 번째 숫자를 입력하세요.");
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

