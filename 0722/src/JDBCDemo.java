/* 7단계
1. import  java.sql*/
import java.sql.*;

public class JDBCDemo {
	public static void main(String[] args) {
	//2. MySQL Driver Loading 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Founded");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		//3. Memory에 로딩된 MySQL Driver를 이용하여 Connection 하자
		String url = "jdbc:mysql://127.0.0.1:3306/mycompany";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "mymysql");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		//4. Statement 객체 생성
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//5. Statement 객체를 이용하여 sql 실행하자.
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("SELECT now(), version()");
		} catch (SQLException e) {
			System.out.println("Query Syntax Error");
		} 	// SELECT용
		//6. ResultSet의 결과를 parsing하자 
		try {
			rs.next();
			String now = rs.getString(1);
			String version = rs.getString(2);
			System.out.println(now + ", " + version);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		// 반드시 Close해야 한다.
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
}








