import java.util.Scanner;

// Quiz 0501
//
//public class test {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		int num = 0;
//		int sum = 0;
//		
//		while(true) {
//			System.out.println("정수를 입력해주세요.");
//			num = s.nextInt();
//			sum = num + sum;
//			
//			if(num == 0) {
//				System.out.println("모든 정수를 더한 결과는" + sum);
//				break;
//			}
//		}
//	}
//}

// Quiz 0505
//public class test {
//	public static void main(String[] args) {
//		
//		int i, j;
//		
//		for(i=2; i<10; i++) {
//			for (j=1; j<10; j++) {
//				
//				if(i % 2 ==0) {
//					if(i >= j) {
//						System.out.print(i + " x " + j + " = " + (i * j)+ "\t");
//					}
//				
//				}
//			}	System.out.println();
//		}
//	}
//}

// Quiz 0506
//public class test {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		int j;
//		int num = 0;
//		System.out.println("정수를 입력하세요.");
//		num = s.nextInt();
//
//		for (j = 9; j >= 1; j--) {
//			System.out.print(num + " x " + j + " = " + (num * j) + "\t");
//		}
//	}
//}

//Quiz 0509
//public class test {
//	public static void main(String[] args) {
//		int i = 0;
//		int sum = 0;
//
//		do {
//			if (i % 2 == 0) {
//				sum = i + sum;
//				System.out.println(i);
//			}
//			i++;
//		} while (i <= 100);
//		{
//			System.out.println(sum);
//		}
//	}
//}

//Quiz 0513
//public class test {
//	public static void main(String[] args) {
//
//		//가로형
//		int i, j;
//		
//		for(j=1; j<10; j++) {
//			for(i=2; i<10; i++) {
//				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
//			} System.out.println();
//		}
//		
//		System.out.println();
//		
//		//세로형
//		int y, z;
//		
//		for(y=2; y<10; y++) {
//			for(z=1; z<10; z++) {
//				System.out.print(y + "x" + z + "=" + (y * z) + "\t");
//			} System.out.println();
//		}
//	} 
//}

//Quiz0512
//public class test {
//	public static void main(String[] args) {
//		int i = 0;
//		int sum = 0;
//		
//		do {
//			sum = i + sum;
//			System.out.print(i);
//			
//			i++;
//			if(i == 1000) {
//				System.out.print("+");
//				System.out.print(i);
//				break;
//			}
//			System.out.print("+");
//	} while(i <= 1000); {
//		System.out.print("=" + sum);
//	}
//}
//}

//Quiz0511
//public class test {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		int i = 1;
//		int sum = 1;
//
//		System.out.println("정수를 입력하세요.");
//		i = s.nextInt();
//
//		while (true) {
//			sum = i * sum;
//			System.out.print(i);
//			if (i != 1) {
//				System.out.print("x");
//			}
//			
//			i--;
//			if (i == 0) {
//				System.out.println();
//				break;
//			}
//		}
//		System.out.println("=" + sum);
//	}
//}
