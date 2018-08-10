import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	int wrongChoice;

	public MenuChoiceException(int choice) {
		super("�߸��� ������ �̷������ϴ�.");
		wrongChoice = choice;
	}

	public void showWrongChoice() {
		System.out.println(wrongChoice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}

	// ����Ŭ JDBC �����
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}

// �θ� Ŭ����
class PhoneInfo implements Serializable {

	String name;
	String phoneNumber;

	public PhoneInfo(String name, String num) {

		this.name = name;
		phoneNumber = num;
	}

	public void showPhoneInfo() {
		// name : ��۸� / phone : 010-1234-5678 ���� ��µǾ� ������
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
	}

	// HashMap ����ߴ�
	public int hashCode() {
		return name.hashCode();
	}

	// True False�϶��� boolean�̴�
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if (name.compareTo(name) == 0)
			return true;
		else
			return false;
	}
}

// PhoneInfo���� ��ӹ���(name�� phone�� �״�� ������)
class PhoneUnivInfo extends PhoneInfo {

	String major;
	String year;

	public PhoneUnivInfo(String name, String num, String major, String year) {

		super(name, num);
		this.major = major;
		this.year = year;
	}

	public void showPhoneInfo() {

		// �ȿ� name�� phone�� �������
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

		// ���� ��ȯ�Ѵ�
		return inst;
	}

	private PhoneBookManager() {
		readFromFile();
	}

	// �Է°��� �о���̴� ��(Normal)
	private PhoneInfo readFriendInfo() {
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}

	// �Է°��� �о���̴� ��(Univ)
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("���� : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("�г� : ");
		String year = MenuViewer.keyboard.nextLine();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}

	// �Է°��� �о���̴� ��(Company)
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("ȸ�� : ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}

	public void inputData() throws MenuChoiceException, SQLException {

		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>> ");

		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;

		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);

		// con�� pstmt ���� ���� �Ϸ�
		// ConnectionPool �̿��ؼ� Oracle�� �ִ� YH������ ��������
		Connection con = ConnectionPool.getConnection();
		PreparedStatement pstmt = null;

		String sql = "";
		int updateCount = 0;

		switch (choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();

			// Normal�� ���� �Է��� ������ �����ž�
			sql = "insert into PhoneBook (" + "name, phonenumber) " + " values (?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info.name);
			pstmt.setString(2, info.phoneNumber);

			// ������Ʈ �� ���ڸ� Ȯ������
			updateCount = pstmt.executeUpdate();
			System.out.println("Normal Update  : " + updateCount);
			break;

		case INPUT_SELECT.UNIV:
			PhoneUnivInfo info1 = (PhoneUnivInfo) readUnivFriendInfo();

			sql = "insert into PhoneBook (" + "name, phonenumber, major, year) " + " values (?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info1.name);
			pstmt.setString(2, info1.phoneNumber);
			pstmt.setString(3, info1.major);
			pstmt.setString(4, info1.year);

			updateCount = pstmt.executeUpdate();
			System.out.println("Univ Update  : " + updateCount);
			break;

		case INPUT_SELECT.COMPANY:
			PhoneCompanyInfo info2 = (PhoneCompanyInfo) readCompanyFriendInfo();

			sql = "insert into PhoneBook (" + "name, phonenumber, company) " + " values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, info2.name);
			pstmt.setString(2, info2.phoneNumber);
			pstmt.setString(3, info2.company);

			updateCount = pstmt.executeUpdate();
			System.out.println("Company Update  : " + updateCount);
			break;
		}

		boolean isAdded = infoStorage.add(info);
		if (isAdded == true)
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
		else
			System.out.println("�̹� ����� �������Դϴ�. \n");
	}

	public void searchData() {

		try {
			Connection con = ConnectionPool.getConnection();
			Statement stmt = null;
			ResultSet rs = null;

			System.out.println("������ �˻��� �����մϴ�.");
			System.out.println("�̸� : ");
			String name = MenuViewer.keyboard.nextLine();

			try {
				String sql = "select * from PhoneBook where name like '%" + name + "%'";
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);

				while (rs.next()) {
					System.out.println("�̸� : " + rs.getString(1));
					System.out.println("��ȭ��ȣ : " + rs.getString(2));
					System.out.println("���и� : " + rs.getString(3));
					System.out.println("�а� : " + rs.getString(4));
					System.out.println("�г� : " + rs.getString(5));
					System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");
				}
			} catch (Exception e) {
				System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteDate() {
		System.out.println("������ ������ �����մϴ�.");
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();

		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (name.compareTo(curInfo.name) == 0) {
				itr.remove();
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
				return;
			}
		}
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
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
		System.out.println("�����ϼ���.");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� : ");
	}
}

public class PhoneBookVer08 {
	public static void main(String[] args) throws SQLException {
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
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.");
			}
		}
	}
}