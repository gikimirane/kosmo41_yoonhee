import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E2_ObjectOutputStream {
	public static void main(String[] args) {
		E1_SBox box1 = new E1_SBox("Robot");
		E1_SBox box2 = new E1_SBox("Strawberry");
		
		try(ObjectOutputStream oo =
				new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
			oo.writeObject(box1);    // box1�� �����ϴ� �ν��Ͻ� ����
			oo.writeObject(box2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
