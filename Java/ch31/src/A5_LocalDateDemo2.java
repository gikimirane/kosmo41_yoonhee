import java.time.LocalDate;
import java.time.Period;

public class A5_LocalDateDemo2 {
	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);

		// 올해 내 생일
		LocalDate xmas = LocalDate.of(today.getYear(), 10, 30);
		System.out.println("Xmas: " + xmas);

		// 내 생일까지 앞으로 며칠?
		Period left = Period.between(today, xmas);
		System.out.println("Xmas까지 앞으로" + left.getMonths() + "개월" + left.getDays() + "일");
	}
}
