

// ������ �����͵��� ���ڿ��� ���·� ���� �����ؾ� �ϸ�,
// ����� �������� ������ ����� �����ϵ��� �޼ҵ嵵 ���ǵǾ�� �Ѵ�.

class PhoneInfo {
	
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}
	
	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}
	
	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		if(birth != null)
			System.out.println("birth : " + birth);
		// ��µǴ� �������� ������ ����
		System.out.println("");    
	}
}

class PhoneBookVer01 {
	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("������", "5316-8250", "92,10,30");
		PhoneInfo pInfo2 = new PhoneInfo("������", "2855-9058", "93,06,11");
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}
}
