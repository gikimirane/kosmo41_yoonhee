import java.util.Scanner;

class Quiz1303 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
	
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"/10 ��° ���� �Է�");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Ȧ�� ��� : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("¦�� ��� : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
	}

}
