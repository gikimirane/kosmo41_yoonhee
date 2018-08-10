import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

interface INIT_MENU {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

interface INPUT_SELECT {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

class MenuChoiceException extends Exception {

	// 오라클 JDBC 연결용
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	int wrongChoice;

	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice = choice;
	}

	public void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
	}
}

// 부모 클래스
class PhoneInfo implements Serializable {

	String name;
	String phoneNumber;
	public String major;
	public int year;
	public String company;

	public PhoneInfo(String name, String num) {

		this.name = name;
		phoneNumber = num;
	}

	public void showPhoneInfo() {
		// name : 김멍멍 / phone : 010-1234-5678 으로 출력되어 보여줌
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
	}

	// HashMap 사용했다
	public int hashCode() {
		return name.hashCode();
	}

	// True False일때는 boolean이다
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if (name.compareTo(name) == 0)
			return true;
		else
			return false;
	}
}

// PhoneInfo에서 상속받음(name과 phone을 그대로 가져옴)
class PhoneUnivInfo extends PhoneInfo {

	String major;
	int year;

	public PhoneUnivInfo(String name, String num, String major, int year) {

		super(name, num);
		this.major = major;
		this.year = year;
	}

	public void showPhoneInfo() {

		// 안에 name과 phone이 들어있음
		super.showPhoneInfo();
		System.out.println("major : " + major);
		System.out.println("year : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo {

	String company;

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company : " + company);
	}
}

class PhoneBookManager {
	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();

	static PhoneBookManager inst = null;

	public static PhoneBookManager createManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();

		// 값을 반환한다
		return inst;
	}

	private PhoneBookManager() {
		readFromFile();
	}

	// 입력값을 읽어들이는 곳(Normal)
	private PhoneInfo readFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}

	// 입력값을 읽어들이는 곳(Univ)
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("전공 : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("학년 : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}

	// 입력값을 읽어들이는 곳(Company)
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("회사 : ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}

	public void inputData() throws MenuChoiceException, SQLException {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;
		
		if(choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);
		
		// con과 pstmt 변수 설정 완료
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// Oracle에 있는 YH서버로 연결해줘
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@ec2-52-79-236-75.ap-northeast-2.compute.amazonaws.com:1521:xe",
					"system",
					"0000");

		String sql = "";
		int updateCount = 0;
				
		switch(choice) {
		case INPUT_SELECT.NORMAL :
			info = readFriendInfo();
			
			// Normal에 내가 입력한 정보를 넣을거야
			sql = "insert into normal values (?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info.name);
			pstmt.setString(2, info.phoneNumber);
			
			// 업데이트 된 숫자를 확인해줘
			updateCount = pstmt.executeUpdate();
			System.out.println("Normal Update  : " + updateCount);
			
			break;
			
		case INPUT_SELECT.UNIV :
			info = readUnivFriendInfo();
			
			sql = "insert into univ values (?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, info.name);
			pstmt.setString(2, info.phoneNumber);
			pstmt.setString(3, info.major);
			pstmt.setInt(4, info.year);
			
			updateCount = pstmt.executeUpdate();
			System.out.println("Univ Update  : " + updateCount);
			break;
			
		case INPUT_SELECT.COMPANY :
			info = readCompanyFriendInfo();
			
			sql = "insert into company values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, info.name);
			pstmt.setString(2, info.phoneNumber);
			pstmt.setString(3, info.company);
			
			updateCount = pstmt.executeUpdate();
			System.out.println("Company Update  : " + updateCount);
			break;
		}
		}catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException sqle) {
			}
		
		boolean isAdded = infoStorage.add(info);
		if(isAdded==true)
			System.out.println("데이터 입력이 완료되었습니다. \n");
		else 
			System.out.println("이미 저장된 데이터입니다. \n");
		}
	}

	public void searchData() {
		System.out.println("데이터 검색을 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();

		PhoneInfo info = search(name);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			info.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	public void deleteDate() {
		System.out.println("데이터 삭제를 시작합니다.");

		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();

		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (name.compareTo(curInfo.name) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다. \n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
	}

	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (name.compareTo(curInfo.name) == 0)
				return curInfo;
		}
		return null;
	}

	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);

			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while (itr.hasNext())
				out.writeObject(itr.next());

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile() {
		if (dataFile.exists() == false)
			return;
		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);

			while (true) {
				PhoneInfo info = (PhoneInfo) in.readObject();
				if (info == null)
					break;
				infoStorage.add(info);
			}
			in.close();
		} catch (IOException e) {
			return;
		} catch (ClassNotFoundException e) {
			return;
		}
	}
}

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

public class PhoneBookVer08 {
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		int choice;

		while (true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);

				switch (choice) {
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELETE:
					manager.deleteDate();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
			}
		}
	}
}