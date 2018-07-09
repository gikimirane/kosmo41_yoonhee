import java.time.LocalDate;
import java.time.Period;

public class A5_LocalDateDemo2 {
	public static void main(String[] args) {
		// ����
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);

		// ���� �� ����
		LocalDate xmas = LocalDate.of(today.getYear(), 10, 30);
		System.out.println("Xmas: " + xmas);

		// �� ���ϱ��� ������ ��ĥ?
		Period left = Period.between(today, xmas);
		System.out.println("Xmas���� ������" + left.getMonths() + "����" + left.getDays() + "��");
	}
}
