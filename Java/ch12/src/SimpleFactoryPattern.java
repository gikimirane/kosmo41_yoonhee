abstract class Human
{
	abstract void print();
}

class Man extends Human
{
	String str;
	
	Man(String str)
	{
		this.str = str;
	}
	
	public void print()
	{
		System.out.println(str +" 생성1");
		System.out.println(str +" 생성2");
	}
}

class Woman extends Human
{
	String str;
	
	Woman(String str)
	{
		this.str = str;
	}
	public void print()
	{
		System.out.println(str +" 생성1");
		System.out.println(str +" 생성2");
		System.out.println(str +" 생성3");
	}
}

class HumanFactory
{
	public static Human create(String str) 
	{
		if(str == "남자") {
			return new Man(str);
		} else if(str == "여자") {
			return new Woman(str);
		}
		return null;
	}
}
// Man 이나 Woman 이나 Human의 자식 객체이므로 부모 객체에 대입할 수 있다. 대입하여 리턴

public class SimpleFactoryPattern
{
	public static void main(String[] args)
	{
		Human h1 = HumanFactory.create("남자");
		h1.print();
		
		Human h2 = HumanFactory.create("여자");
		h2.print();
	}
}

//생성된 애가 남자인지 여자인지 중요하지 않고 난 생성된 인간 객체의 프린트 기능만 쓸 것이다.
//남자이면 남자애가 가진 기능을 할 것이고, 여자이면 여자애가 가진 기능을 할 것이다.
//
//문 : 열다
//삼성 : 앞으로 밀어서 여는 문
//LG : 옆으로 밀어서 여는 문
//현대 당겨서 여는 문
//
//문을 가지고 코딩을 하면 업체를 바꿔도 내 코드는 변경할 필요가 없다.

