
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] array = { { "1", "2", "3" }, { "4", "x", "5" }, { "6", "7", "8" } };

		int x = 0;
		int y = 0;
		String str = null;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + "\t");
				if (array[i][j].equals("x")) {
					x = i;
					y = j;
				}
			}
			System.out.println();
		}
		System.out.println();

		str = array[1][2];
		array[1][2] = array[x][y];
		array[x][y] = str;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(x);
		System.out.println(y);

	}

}
