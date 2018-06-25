
public class MyBooks
{
	int price;
	String title;
	
	MyBooks(String t, int p)
	{
		title = t;
		price = p;
	}
	
	//복제 생성자
	MyBooks(MyBooks copy)
	{
		title = copy.title;
		price = copy.price;
	}
	
	void print()
	{
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
		
	}

}

class Book
{
	public static void main(String[] args)
	{
		MyBooks books1 = new MyBooks("게임스쿨", 10000);
		books1.print();
		
		Mybooks books2 = new MyBooks(books1);
		books2.title = "모바일게임";
		books2.print();
	}
}

