

// 다음의 데이터들이 문자열의 형태로 저장 가능해야 하며,
// 저장된 데이터의 적절한 출력이 가능하도록 메소드도 정의되어야 한다.

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
		// 출력되는 데이터의 구분을 위해
		System.out.println("");    
	}
}

class PhoneBookVer01 {
	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("조윤희", "5316-8250", "92,10,30");
		PhoneInfo pInfo2 = new PhoneInfo("전유경", "2855-9058", "93,06,11");
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}
}
