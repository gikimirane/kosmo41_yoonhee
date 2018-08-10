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
		
		System.out.println("데이터 검색을 시작합니다.");
		
		System.out.print("이름 : ");
		String name = s.nextLine();
//		System.out.print("소속명: ");
		String table = "company";

		String sql = "select * from "+table+" where name = '"+name+"'";
		// select * from company where name = 유니
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(sql);
		
		//rs.next() <- true, false return 해줌..
		
		while(rs.next()) {
			System.out.println("이름 : "+rs.getString(1));
			System.out.println("전번 : "+rs.getString(2));
			System.out.println("그다음 뭐냐 : "+rs.getString(3));
		}
		
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(con!=null) con.close();
	}
	public static void main(String[] args) throws SQLException {
		searchData();
	}

}
