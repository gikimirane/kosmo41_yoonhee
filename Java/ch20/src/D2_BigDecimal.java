import java.math.BigDecimal;

public class D2_BigDecimal
{
	public static void main(String[] args)
	{
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println("µ¡¼À °á°ú: " + d1.add(d2));
		System.out.println("°ö¼À °á°ú: " + d1.multiply(d2));
	}
}

//public BigDecimal add(BigDecimal augend)
//public BigDecimal substract(BigDecimal subtrahend)
//public BigDecimal multiply(BigDecimal multiplicand)
//public BigDecimal devide(BigDecimal divisor)