import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D_StringBinarySearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		//Á¤·Ä
		Collections.sort(list);
		//Å½»ö
		int idx = Collections.binarySearch(list,  "RObot");
		//Å½»ö °á°ú Ãâ·Â
		System.out.println(list.get(idx));
	}
}
