package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/banco";
	private final String USER = "root";
	private final String PASS = "";

	public Connection getConnection() {

		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASS);

		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro na conexão: ", e); // e.printStackTrace();
		}
	}

	public static void closeConnection(Connection con) { 

		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// Right here we start an overload prevent, just to assure data won't will be saved long time after.
	
	public static void closeConnection(Connection con, PreparedStatement stmt) { // That method maybe will
																					// be usefull to close,
																					// but usualy, a
																					// connection comes with
																					// a statement.
		closeConnection(con);

		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) { // That method maybe will
																								// be usefull to close,
																								// but usualy, a
																								// connection comes with
																								// a statement.

		closeConnection(con, stmt);

		try {
			if (rs != null) {
				rs.close();
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
