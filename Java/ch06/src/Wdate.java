class Wdata {
	int month;
	int day;
	String sky;

}

class Wdate {
	public static void main(String[] args) {
		Wdata today = new Wdata();
		today.month = 10;
		today.day = 5;
		today.sky = "¸¼À½";

		System.out.println(today.month + "¿ù" + today.day + "ÀÏ" + today.sky);
	}
}
