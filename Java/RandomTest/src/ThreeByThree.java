import java.util.Scanner;

public class ThreeByThree {
	public static void main(String[] args) {

		String[][] arr = { { "1", "2", "3" }, { "4", "x", "5" }, { "6", "7", "8" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("[ Move ] a:Left s:Right w:Up z:Down");
		System.out.println("[ Exit ] k:Exit");
		System.out.print("이동키를 입력하세요 : ");
		
		Scanner s = new Scanner(System.in);

		char user;
		user = s.nextLine().charAt(0);

		if (user == 'a') {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if ((j - 1) >= 0 && arr[i][j - 1] == "x") {
						arr[i][j - 1] = arr[i][j];
						arr[i][j] = "x";
						break;
					}
					
				}
			}
		
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
	}
	}
}

// if (str.equals("a")) {
// for (int i = 0; i < 3; i++) {
//
// {
// str = arr[1][1];
// arr[1][1] = arr[1][2];
// arr[1][2] = str;
// }
// }
// }
/////////////////////////////////////////////////////////////////////////////////
// ShuffleQuestion();
// arrPrint();
// System.out.println("정답입니다. 게임을 종료합니다.");

/////////////////////////////////////////////////////////////////////////////////

// System.out.println("[ Exit ] k:Exit");
// str = s.nextLine();
// if(str.equalsIgnoreCase("k"))
// {
// System.out.println("Good Bye~");
// }
