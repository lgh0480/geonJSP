package co.micol.member.command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection getConnection() {
		
		Connection conn = null;
		String diver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="demo";
		String password="demo";
		try {
			Class.forName(diver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
