import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class C2_FileRandomAccess {
	public static void main(String[] args) {
		Path fp = Paths.get("data.dat");
		ByteBuffer wb = ByteBuffer.allocate(1024);
		wb.putInt(120);    //4byte
		wb.putInt(240);
		wb.putDouble(0.94);    //8byte
		wb.putDouble(0.75);
		
		// �ϳ��� ä�� ����
		try(FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE,
				StandardOpenOption.READ, StandardOpenOption.WRITE)) {
			// ���Ͽ� ����
			wb.flip();
			fc.write(wb);
			// ���Ϸκ��� �б�
			ByteBuffer rb = ByteBuffer.allocate(1024);
			fc.position(0);    // ä���� �������� �� ������ �̵�
			fc.read(rb);    // ��� ������ �� ����
			// ���� ���۷κ��� ������ �б�
			rb.flip();
			System.out.println(rb.getInt());    //4byte�̵���
			
			rb.position(Integer.BYTES*2);
			System.out.println(rb.getDouble());
			System.out.println(rb.getDouble());
			
			rb.position(Integer.BYTES);
			System.out.println(rb.getInt());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}


// Integer.BYTES : int�� ������ ũ�⿡ ���� ���(=4)