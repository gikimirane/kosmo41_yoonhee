public class B_IsNumber2 {
	public static void main(String[] args) {
		String value = "12o34";
		String ch = "";
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++) {
			ch = value.substring(i, i+1);
			//System.out.println(ch);
			
			try {
				int num = Integer.parseInt(ch);
			} catch(Exception e) {
				isNumber = false;
				break;
			}
		}
		if(isNumber) {
			System.out.println(value + "�� �����Դϴ�.");
		} else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}
	}
}
