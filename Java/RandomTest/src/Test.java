import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	
	public static void searchData() throws SQLException {
		Scanner s = new Scanner(System.in);
		Connection con;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		System.out.println("������ �˻��� �����մϴ�.");
		
		System.out.print("�̸� : ");
		String name = s.nextLine();
//		System.out.print("�ҼӸ�: ");
		String table = "company";

		String sql = "select * from "+table+" where name = '"+name+"'";
		// select * from company where name = ����
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(sql);
		
		//rs.next() <- true, false return ����..
		
		while(rs.next()) {
			System.out.println("�̸� : "+rs.getString(1));
			System.out.println("���� : "+rs.getString(2));
			System.out.println("�״��� ���� : "+rs.getString(3));
		}
		
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(con!=null) con.close();
	}
	public static void main(String[] args) throws SQLException {
		searchData();
	}

}
