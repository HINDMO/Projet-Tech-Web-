package com.octest.signup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupDao {
		public int registerUser(SignupBean user) throws ClassNotFoundException {
			String INSERT_USERS_SQL = "INSERT INTO useer"
					+ "  (username, first_name, last_name, address,pass_word) VALUES "
					+ " (?, ?, ?, ?, ?);";

			int result = 0;

			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users?useTimezone=true&serverTimezone=UTC", "root", "root");

					// Step 2:Create a statement using connection object
			    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
				preparedStatement.setString(1, user.getUsername());
				preparedStatement.setString(2, user.getFirstName());
				preparedStatement.setString(3, user.getLastName());
				preparedStatement.setString(4, user.getAddress());
				preparedStatement.setString(5, user.getPassword());
				
				System.out.println(preparedStatement);
				result = preparedStatement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}

		private void printSQLException(SQLException ex) {
			for (Throwable e : ex) {
				if (e instanceof SQLException) {
					e.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
}
