import java.time.Duration;
import java.time.Instant;

public class A1_InstantDemo {
	public static void main(String[] args) {
		Instant start = Instant.now();    //���� �ð� ������ ����
		System.out.println("����:" + start.getEpochSecond());
		//��ȯ ���� '1970-01-01 00:00:00'�� �������� ������ �ð��� �� ������ ����� ���
		System.out.println("Time flies like an arrow.");
		
		Instant end = Instant.now();
		System.out.println("��: " + end.getEpochSecond());
		
		Duration between = Duration.between(start, end);
		//�� �ð��� �� ��� Duration�� �ð� ���� ǥ���ϱ� ���� Ŭ����
		System.out.println("�и� �� ���� ��: " + between.toMillis());
	}
}
