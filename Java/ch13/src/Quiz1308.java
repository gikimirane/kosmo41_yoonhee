import java.util.Scanner;
//성적관리 프로그램을 작성한다.
//국어, 영어, 수학, 국사 4과목이고 학생은 이순신, 강감찬, 을지문덕, 권율 4명이다.
//4 by 4 배열을  선언하고 사용자로부터 4사람의 4과목 점수를 입력받아
//다음의 형태로 값을 저장하고 총점을 구하는 프로그램을 작성하라.
public class Quiz1308
{	
	public static void main(String[] args)
	{
		int[][] nScore = new int[4][6];
		int hsum = 0;
		int[] vsum = new int[4];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<4; i++)
		{
			switch(i) {
			case 0:
				System.out.println("4명의 국어점수 입력");
				break;
			case 1:
				System.out.println("4명의 영어점수 입력");
				break;
			case 2:
				System.out.println("4명의 수학점수 입력");
				break;
			case 3:
				System.out.println("4명의 국사점수 입력");
				break;
			default:
				break;
			}
			for(int j=0; j<4; j++)
			{
				nScore[i][j] = s.nextInt();;
			}
			System.out.println();
			
			System.out.println("구분\t이순신\t강감찬\t을지문덕\t권율\t총점");
			for(int j=0; i<4; i++)
			{
				switch(i) {
				case 0:
					System.out.println("국어:\t");
					break;
				case 1:
					System.out.println("영어:\t");
					break;
				case 2:
					System.out.println("수학:\t");
					break;
				case 3:
					System.out.println("국사:\t");
					break;
				default:
					break;
				}
				
				hsum = 0;
				for(int z=0; z<4; z++)
				{
					System.out.println(nScore[i][j] + "\t");
					hsum = hsum + nScore[i][j];
					vsum[i] = vsum[i] + nScore[j][i];
				}
				System.out.println(hsum);
			}
			System.out.print("총점\t" + vsum[0] + "\t" + vsum[1] + "\t" + vsum[2] + "\t" + vsum[3] + "\t");
		}
	}
}
	
					


