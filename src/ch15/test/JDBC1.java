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
		//1 - ���� ����� �����Ͷ� - Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2 - �����϶� - Connection
		Connection con = DriverManager.getConnection(url, id, pwd);
		//3 - select�϶� - Statement
		Statement stmt = con.createStatement();
		//4 - ����� Ȯ���϶� - ResultSet
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
		//5 - ���� �����϶� - close();
		rs.close();
		stmt.close();
		con.close();
	}
}