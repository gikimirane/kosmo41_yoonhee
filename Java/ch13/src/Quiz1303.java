import java.util.Scanner;
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를 구분해서 출력하라.
class Quiz1303 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
	
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"/10 번째 정수 입력");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("홀수 출력 : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("짝수 출력 : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
	}
}
