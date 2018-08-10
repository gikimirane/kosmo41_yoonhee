import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

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

class PhoneInfo implements Serializable { // 부모 클래스
	String name;
	String phoneNumber;

	public PhoneInfo(String name, String num) {
		this.name = name;
		this.phoneNumber = num; // 변수 지정
	}

	public void showPhoneInfo() {
		// name : 김멍멍 / phone : 010-1234-5678 으로 출력되어 보여줌
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
	}

	public String toString() {
		return "name : " + name + '\n' + "phone : " + phoneNumber + '\n';
	}

	public int hashCode() {
		// HashMap 사용했다.
		return name.hashCode();
	}

	// True False일때는 boolean이다.
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if (name.compareTo(cmp.name) == 0)
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

		// major : 멍멍 / year : 3학년 으로 출력되어 보여줌
		System.out.println("major : " + major);
		System.out.println("year : " + year);
	}

	public String toString() {
		return super.toString() + "major : " + major + '\n' + "year : " + year + '\n';
	}
}

// PhoneInfo에서 상속받음(name과 phone을 그대로 가져옴)
class PhoneCompanyInfo extends PhoneInfo {

	String company;

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
		// company : 멍멍 으로 출력되어 보여줌
		System.out.println("company : " + company);
	}

	public String toString() {
		return super.toString() + "company : " + company + '\n';
	}
}

class PhoneBookManager1 {
	// private static final String NORMAL = null;
	// private static final String UNIV = null;
	// private static final String COMPANY = null;

	private final File dataFile = new File("PhoneBook1.dat");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();

	static PhoneBookManager1 inst = null;

	public static PhoneBookManager1 createManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager1();

		// 값을 반환한다.
		return inst;
	}

	private PhoneBookManager1() {
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

		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);

		// con과 pstmt 변수 설정 완료
		Connection con = null;
		PreparedStatement pstmt = null;

		// Oracle에 있는 YH서버로 연결해줘
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@ec2-52-79-236-75.ap-northeast-2.compute.amazonaws.com:1521:xe", "system",
					"0000");

			String sql = "";
			int updateCount = 0;

			switch (choice) {
			case INPUT_SELECT.NORMAL:
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

			// pstmt.clearParameters();
			// String tablename = "NORMAL";
			// sql = "insert into ALLTABLE values(?, ?)"; // insert ALLTABLE에도 같이해줘
			// pstmt.setString(1, info.name); // 이름 넣어줘
			// pstmt.setString(2, tablename); // 내가 이름을 넣은 테이블명도 넣어줘
			// updateCount = pstmt.executeUpdate();
			// System.out.println("all Update : " + updateCount);
			// break;

			case INPUT_SELECT.UNIV:
				PhoneUnivInfo info1 = (PhoneUnivInfo) readUnivFriendInfo();

				sql = "insert into univ values (?, ?, ?, ?)";
				pstmt = con.prepareStatement(sql);

				// System.out.println("a["+info1.name+"]");
				// System.out.println("a["+info1.phoneNumber+"]");
				// System.out.println("a["+info1.major+"]");
				// System.out.println("a["+info1.year+"]");

				pstmt.setString(1, info1.name);
				pstmt.setString(2, info1.phoneNumber);
				pstmt.setString(3, info1.major);
				pstmt.setInt(4, info1.year);
				updateCount = pstmt.executeUpdate();
				System.out.println("Univ Update  : " + updateCount);
				break;

			case INPUT_SELECT.COMPANY:
				PhoneCompanyInfo info2 = (PhoneCompanyInfo) readCompanyFriendInfo();

				sql = "insert into company values (?, ?, ?)";
				pstmt = con.prepareStatement(sql);

				// System.out.println("b["+info2.name+"]");
				// System.out.println("b["+info2.phoneNumber+"]");
				// System.out.println("b["+info2.company+"]");

				pstmt.setString(1, info2.name);
				pstmt.setString(2, info2.phoneNumber);
				pstmt.setString(3, info2.company);
				updateCount = pstmt.executeUpdate();
				System.out.println("Company Update  : " + updateCount);
				break;
			}
		} catch (SQLException sqle) {
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

			if (isAdded == true)
				System.out.println("데이터 입력이 완료되었습니다. \n");
			else
				System.out.println("이미 저장된 데이터입니다. \n");
		}
	}

	public String searchData(String name) {
		PhoneInfo info = search(name);
		if (info == null)
			return null;
		else
			return info.toString();
	}

//	// 오버로딩으로 메소드 추가함
//	public void searchData() {
//		System.out.println("데이터 검색을 시작합니다.");
//
//		System.out.print("이름 : ");
//		String name = MenuViewer.keyboard.nextLine();
//
//		PhoneInfo info = search(name);
//		if (info == null) {
//			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
//		} else {
//			info.showPhoneInfo();
//			System.out.println("데이터 검색이 완료되었습니다. \n");
//		}
//	}

	
	// 꿍유 언니가 짜준 
	// public void searchData() throws SQLException {
	// Connection con;
	// con =
	// DriverManager.getConnection("jdbc:oracle:thin:@ec2-52-79-236-75.ap-northeast-2.compute.amazonaws.com:1521:xe",
	// "system",
	// "0000");
	// PreparedStatement pstmt = null;
	// ResultSet rs =null;
	//
	// System.out.println("데이터 검색을 시작합니다.");
	//
	// System.out.print("이름 : ");
	// String name = MenuViewer.keyboard.nextLine();
	//
	// String sql = "select * from where name = '"+name+"' ";
	// // select * from company where name = 유니
	// // select department from all where name = 유니
	// // String department = rs.getString;
	// // select * from department where name = 유니;
	//
	// pstmt = con.prepareStatement(sql);
	// rs = pstmt.executeQuery(sql);
	//
	// //rs.next()는 true, false를 return 해준다.
	// while(rs.next()) {
	// System.out.println("이름 : "+rs.getString(1));
	// System.out.println("전화번호 : "+rs.getString(2));
	// System.out.println("회사명 : "+rs.getString(3));
	// }
	// if(rs!=null) rs.close();
	// if(pstmt!=null) pstmt.close();
	// if(con!=null) con.close();
	// }

	public boolean deleteData(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (name.compareTo(curInfo.name) == 0) {
				itr.remove();
				return true;
			}
		}
		return false;
	}

//	// 오버로딩으로 메소드 추가함
//	public void deleteData() {
//
//		System.out.println("데이터 삭제를 시작합니다.");
//
//		System.out.print("이름 : ");
//		String name = MenuViewer.keyboard.nextLine();
//
//		Iterator<PhoneInfo> itr = infoStorage.iterator();
//		while (itr.hasNext()) {
//			PhoneInfo curInfo = itr.next();
//			if (name.compareTo(curInfo.name) == 0) {
//				itr.remove();
//				System.out.println("데이터 삭제가 완료되었습니다. \n");
//				return;
//			}
//		}
//		System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
//	}

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

//class SearchEventHandler implements ActionListener {
//	JTextField searchField;
//	JTextArea textArea;
//
//	public SearchEventHandler(JTextField field, JTextArea area) {
//		searchField = field;
//		textArea = area;
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		String name = searchField.getText();
//		PhoneBookManager1 manager = PhoneBookManager1.createManagerInst();
//		String srchResult = manager.searchData(name);
//		if (srchResult == null) {
//			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
//		} else {
//			textArea.append("찾으시는 정보를 알려드립니다. \n");
//			textArea.append(srchResult);
//			textArea.append("\n");
//		}
//	}
//}

//class DeleteEventHandler implements ActionListener {
//	JTextField delField;
//	JTextArea textArea;
//
//	public DeleteEventHandler(JTextField field, JTextArea area) {
//		delField = field;
//		textArea = area;
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		String name = delField.getText();
//		PhoneBookManager1 manager = PhoneBookManager1.createManagerInst();
//		boolean isDeleted = manager.deleteData(name);
//		if (isDeleted)
//			textArea.append("데이터 삭제를 완료하였습니다. \n");
//		else
//			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
//	}
//}
//
//class SearchDelFrame extends JFrame {
//	private static GraphicsConfiguration title;
//	JTextField srchField = new JTextField(15);
//	JButton srchBrn = new JButton("SEARCH");
//
//	JTextField delField = new JTextField(15);
//	JButton delBtn = new JButton("DEL");
//
//	JTextArea textArea = new JTextArea(20, 25);
//
//	public SearchDelFrame(String string) {
//	}
//
//	public SearchDelFrame() {
//		super(title);
//		setBounds(100, 200, 330, 450);
//		setLayout(new BorderLayout());
//		Border border = BorderFactory.createEtchedBorder();
//
//		Border srchBorder = BorderFactory.createTitledBorder(border, "Search");
//		JPanel srchPanel = new JPanel();
//		srchPanel.setBorder(srchBorder);
//		srchPanel.setLayout(new FlowLayout());
//		srchPanel.add(srchField);
//		srchPanel.add(srchBrn);
//
//		Border delBorder = BorderFactory.createTitledBorder(border, "Delete");
//		JPanel delPanel = new JPanel();
//		delPanel.setBorder(delBorder);
//		delPanel.setLayout(new FlowLayout());
//		delPanel.add(delField);
//		delPanel.add(delBtn);
//
//		JScrollPane scrollTextArea = new JScrollPane(textArea);
//		Border textBorder = BorderFactory.createTitledBorder(border, "Infomation Board");
//		scrollTextArea.setBorder(textBorder);
//
//		add(srchPanel, BorderLayout.NORTH);
//		add(delPanel, BorderLayout.SOUTH);
//		add(scrollTextArea, BorderLayout.CENTER);
//
//		srchBrn.addActionListener(new SearchEventHandler(srchField, textArea));
//		delBtn.addActionListener(new DeleteEventHandler(delField, textArea));
//
//		setVisible(true);
//		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//	}
//}

public class PhoneBookVer091 {
	public static void main(String[] args) throws SQLException {
		PhoneBookManager1 manager = PhoneBookManager1.createManagerInst();
		SearchDelFrame winFrame = new SearchDelFrame("PhoneBookVer09");

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
					manager.deleteData();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
			}
		}
	}
}
