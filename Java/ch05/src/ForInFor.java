
public class ForInFor {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {    // 바깥쪽 for문
			System.out.println("--------------------");
			for(int j = 0; j < 3; j++) {    // 안쪽 for문
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.print('\n');
		}
	}

}



//   public static void main(String[] args) {
//       for(int i = 2; i < 10; i++) {    // 2단부터 9단까지 진행을 위한 바깥쪽 for 문
//           for(int j = 1; j < 10; j++)    //1부터 9까지의 곱을 위한 안쪽 for문
//               System.out.println(i + " x " + j + " = " + (i * j));
//   }