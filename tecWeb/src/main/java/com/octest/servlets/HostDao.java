package com.octest.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HostDao {
	public int registerHost(Host host) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO hostcondidat"
				+ "  (full_name, languagespoken, Brand_name, email_id, mobile_number,city) VALUES "
				+ " (?, ?, ?, ?, ?,? );";

		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosts?useTimezone=true&serverTimezone=UTC", "root", "root");

				// Step 2:Create a statement using connection object
		    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, host.getFullName());
			preparedStatement.setString(2, host.getLanguagespoken());
			preparedStatement.setString(3, host.getBrandname());
			preparedStatement.setString(4, host.getCity());
			preparedStatement.setString(5, host.getContact());
			preparedStatement.setString(6, host.getAddress());
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
