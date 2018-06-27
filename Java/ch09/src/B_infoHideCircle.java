class Circle2 {
	private double rad = 0;    //원의 반지름
	final double PI = 3.14;
	
	public Circle2(double r) {
		setRad(r);
	}
	
	public void setRad(double r) {    //setter
		if(r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getRad() {   //getter
		return rad;
	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
}

public class B_infoHideCircle {

	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());
//		System.out.println(c.getRad());
		System.out.println();
		
		c.setRad(2.5);
		System.out.println(c.getArea());
//		System.out.println(c.getRad());
		System.out.println();
		
		c.setRad(-3.3);
		System.out.println(c.getArea());
//		System.out.println(c.getRad());
		System.out.println();
		
		c.rad = -4.5;    
		System.out.println(c.getArea());
//		System.out.println(c.getRad());
		System.out.println();

	}

}
