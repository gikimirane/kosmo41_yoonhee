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
		
		// 하나의 채널 생성
		try(FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE,
				StandardOpenOption.READ, StandardOpenOption.WRITE)) {
			// 파일에 쓰기
			wb.flip();
			fc.write(wb);
			// 파일로부터 읽기
			ByteBuffer rb = ByteBuffer.allocate(1024);
			fc.position(0);    // 채널의 포지션을 맨 앞으로 이동
			fc.read(rb);    // 모든 데이터 다 들어옴
			// 이하 버퍼로부터 데이터 읽기
			rb.flip();
			System.out.println(rb.getInt());    //4byte이동함
			
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


// Integer.BYTES : int형 정수의 크기에 대한 상수(=4)