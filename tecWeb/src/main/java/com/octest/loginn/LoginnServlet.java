package com.octest.loginn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/LoginnServlet")
public class LoginnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginnDao loginnDao;

	public void init() {
		loginnDao = new LoginnDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String pass_word = request.getParameter("pass_word");
		LoginnBean loginnBean = new LoginnBean();
		loginnBean.setUsername(username);
		loginnBean.setPassword(pass_word);

		try {
			if (loginnDao.validate(loginnBean)) {
				//HttpSession session = request.getSession();
				// session.setAttribute("username",username);
				response.sendRedirect("experienceshost.jsp");
			} else {
				HttpSession session = request.getSession();
				//session.setAttribute("user", username);
				response.sendRedirect("hostlogin.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
