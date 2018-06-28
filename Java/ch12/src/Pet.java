class Animal
{
	String name;
	int age;
	
	void printPet()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Cat extends Animal
{
	String variety;
	
	void printPet()
	{
		super.printPet();    // super란 위에꺼까지 불러서 같이 데려옴.
		System.out.println("종류 : " + variety);
	}
}

public class Pet     // 오버라이딩은 같은 것을 뜻한다.
{                    // 기능을 추가하거나 덮어쓸때 사용한다.
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		cat.name = "양순이";
		cat.age = 5;
		cat.variety = "페르시안";
		cat.printPet();
	}

}
