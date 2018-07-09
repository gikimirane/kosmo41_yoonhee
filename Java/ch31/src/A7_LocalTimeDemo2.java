import java.time.Duration;
import java.time.LocalTime;

public class A7_LocalTimeDemo2 {
	public static void main(String[] args) {
		// PC���� PC �̿� ���� �ð�
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("PC �̿� ���� �ð�: " + start);
		
		// PC���� PC �̿� ���� �ð�
		LocalTime end = LocalTime.of(17, 31, 19);
		System.out.println("PC �̿� ���� �ð�: " + end);
		
		// PC �̿� �ð� ���
		Duration between = Duration.between(start, end);    //�ð� �� ��ѿ��� �� ��쿡�� Duration Ŭ������ ���ȴ�.
		System.out.println("�� PC �̿� �ð�: " + between);
		System.out.println("�� PC �̿� �ð�: " + between.toHours() + ":" + between.toMinutes() + ":" + between.toMillis());           
	}
}
