package ch15.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String id = "scott";
		String pwd = "tiger";
		//ip, port, db name
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//1 - 연결 모듈을 가져와라 - Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2 - 연결하라 - Connection
		Connection con = DriverManager.getConnection(url, id, pwd);
		//3 - select하라 - Statement
		Statement stmt = con.createStatement();
		//4 - 결과를 확인하라 - ResultSet
		ResultSet rs = stmt.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println(rs.getString("empno") + "\t");
			System.out.println(rs.getString("ename") + "\t");
			System.out.println(rs.getString("job") + "\t");
			System.out.println(rs.getString("mgr") + "\t");
			System.out.println(rs.getString("empno") + "\t");
			System.out.println(rs.getString("") + "\t");
			System.out.println(rs.getString("empno") + "\t");
			System.out.println(rs.getString("deptno"));
		}
		//5 - 연결 종료하라 - close();
		rs.close();
		stmt.close();
		con.close();
	}
}