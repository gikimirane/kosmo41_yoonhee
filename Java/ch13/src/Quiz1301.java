import java.util.Scanner;
//���̰� 5�� int�� �迭�� �����ؼ� ����ڷκ��� 5���� ������ �Է¹޴´�.	
//�׸��� �ִ밪, �ּҰ�, ��� ���� ���� ���϶�. �Լ�(�ִ�,�ּ�,��)�� �����Ͽ� �����Ͻÿ�.
public class Quiz1301 {
	
	void PrintMax(int[] arr) {
		int buffer = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[0] < arr[i]) {
				buffer = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + buffer);
	}
	void PrintMin() {
		
	}
	void PrintSum() {
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("13-1 : �ִ밪, �ּҰ�, ���� ���ϱ�");
		Quiz1301 method = new Quiz1301();
		Scanner scan = new Scanner(System.in);
		int[] arrayNum = new int[5];
		
		for
//		int[] num = new int[5];
//		
//		Scanner s = new Scanner(System.in);
//		
//		for(int i=0; i<5; i++)
//		{
//			System.out.println("100�̸��� ���ڸ� �Է��ϼ���.");
//			num[i] = s.nextInt();
//		}
//		
//		int nMax = 0;
//		int nMin = 1000;
//		
//		for(int i=0; i<5; i++)
//		{
//			if(nMax < num[i])
//			{
//				nMax = num[i];
//			}
//			if(nMin > num[i])
//			{
//				nMin = num[i];
//			}
//			System.out.println(nMax + nMin);
//		}		
	}
}
