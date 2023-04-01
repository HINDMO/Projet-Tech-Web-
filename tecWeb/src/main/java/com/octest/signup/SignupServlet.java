package com.octest.signup;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Servlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init() {
		new SignupDao();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignupServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/userregister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String pass_word = request.getParameter("pass_word");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String address = request.getParameter("address");
		

		SignupBean user = new SignupBean();
		user.setUsername(username);
		user.setPassword(pass_word);
		user.setFirstName(first_name);
		user.setLastName(last_name);
		user.setAddress(address);
		

		try {
			SignupDao signupDao = new SignupDao();
			signupDao.registerUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/userdetails.jsp");
		dispatcher.forward(request, response);
	}
}
