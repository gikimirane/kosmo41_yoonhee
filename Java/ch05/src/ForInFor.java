
public class ForInFor {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {    // �ٱ��� for��
			System.out.println("--------------------");
			for(int j = 0; j < 3; j++) {    // ���� for��
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.print('\n');
		}
	}

}



//   public static void main(String[] args) {
//       for(int i = 2; i < 10; i++) {    // 2�ܺ��� 9�ܱ��� ������ ���� �ٱ��� for ��
//           for(int j = 1; j < 10; j++)    //1���� 9������ ���� ���� ���� for��
//               System.out.println(i + " x " + j + " = " + (i * j));
//   }