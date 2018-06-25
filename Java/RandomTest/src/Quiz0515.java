import java.util.Random;
public class Quiz0515 {

	public static void main(String[] args) {
		
			Random randomV1 = new Random();
			
			int num1 = randomV1.nextInt(10);
			int num2 = randomV1.nextInt(10);
			int num3 = randomV1.nextInt(10);
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			
//			for (int i = 0 ; i < 100; i++) {
//				System.out.println((num1 != num2) && (num2 != num3) && (num1 != num3));
//			}
			

			int i = 0;
			while(true) ((num1 != num2) && (num2 != num3) && (num1 != num3));
				System.out.println(num1 + num2 + num3);
				i++;
				break;
							}
			
			
			
			
		}
	}

