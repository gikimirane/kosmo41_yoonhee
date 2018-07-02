interface Printable1
{
	public void print(String doc);
}

class SPrinterDriver implements Printable1
{
	public void print(String doc)
	{
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable1
{
	public void print(String doc)
	{
		System.out.println("From LG printer");
		System.out.println(doc);
	}

	public static void main(String[] args)
	{
		String myDoc = "This is a reprot about...";
		
		//삼성 프린터로 출력
		Printable1 prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		//LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
