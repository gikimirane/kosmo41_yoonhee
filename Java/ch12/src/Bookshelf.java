class Book
{
	String title;
	String genre;
	
	void printBook()
	{
		System.out.println("���� : " + title);
		System.out.println("�帣 : " + genre);
	}
}

class Novel extends Book    //extends Book ����Ȱ� ���� �ø���.(���)
{                           //Novel�� ����� �帣�� ����� �ڵ尡 �ִ� Book���� ����Ѵ�.
	String writer;
	
	void printNov()
	{
		printBook();
		System.out.println("���� : " + writer);
	}
}

class Magazine extends Book
{
	int day;
	
	void printMag()
	{
		printBook();
		System.out.println("�߸��� : " + day + "��");
	}
}

public class Bookshelf
{
	public static void main(String[] args)
	{
		Novel nov = new Novel();
		nov.title = "�����";
		nov.genre = "��������";
		nov.writer = "�踸��";
		
		Magazine mag = new Magazine();
		mag.title = "���� �ڹ� �׸�å";
		mag.genre = "��ǻ��";
		mag.day = 20;
		
		nov.printNov();
		System.out.println();
		mag.printMag();
		

	}

}
