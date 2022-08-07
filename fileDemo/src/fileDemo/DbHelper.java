package fileDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

	private String userName = "root";
	private String password = "";
	private String databaseUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(databaseUrl, userName, password);
	}

	public void showErrorMessage(SQLException exception) {
		System.out.println("Hata Mesajý : " + exception.getMessage());
		System.out.println("Hata Kodu : " + exception.getErrorCode());
	}
}
