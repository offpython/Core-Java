import java.sql.*; //1단계
public class JDBCDemo1 {
	private static final String url = "jdbc:mysql://127.9.9.1:3306/mycompany";
	private static final String id = "root";
	private static final String password = "mymysql";
	
 	public static void main(String[] args) {
 		Connection conn = null;
 		Statement stmt = null;
 		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			//3단계
			conn = DriverManager.getConnection(url, id, password);
			//4단계
			stmt = conn.createStatement();
			//5단계 : Query 실행하기
			String sql = "SELECT  empno, ename, job, sal				";
					sql += "FROM emp				";
					sql += "WHERE sal >= 1500";
			rs = stmt.executeQuery(sql);
			//6단계 : ResultSet 파싱하기
			while(rs.next()) {
				int empno = rs.getInt(1); // empno
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				System.out.printf("%d\t%s\t%s\t%.2f\n", empno, ename, job,sal);
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			//7단계 :close
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}




