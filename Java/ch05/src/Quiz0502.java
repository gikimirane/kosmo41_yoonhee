import java.util.Scanner;

public class Quiz0502 {

//	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		int nsum = 0;
//		int nCount = s.nextInt();
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("���ڸ� �Է��ϼ���.");
//			int num1 = s.nextInt();
//			nsum = nsum + num1;
			
//		}
		
//		int nResult = nsum / 10;
//		System.out.println(nResult);
		
//	}

//}



    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println("���ڸ� �Է��ϼ���.");
    	int nCount = s.nextInt();
    	float nSum = 0;
    	
    	for (int i=0; i < nCount; i++) {
    		System.out.println("���ڸ� �Է��ϼ���.");
    		int nInputNum = s.nextInt();
    		nSum = nSum + nInputNum;
    		
    		
    	}
    	
    	System.out.println(nSum / nCount);
    	
    }
}