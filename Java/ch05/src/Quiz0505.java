// 구구단을 출력하되 짝수단만 출력하도록 프로그램을 작성하라.
// 단, 2단은 2*2까지만, 4단은 4*4까지만....8단은 8*8까지만 출력해야 한다.

public class Quiz0505 {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j =1; j <10; j++) {
				if(j % 2 == 0) {
					System.out.println(i + " x " + j + " = " + (i * j));	
				}
			}
		}
	}
}