package com.octest.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HostDao hostDao;

	public void init() {
		hostDao = new HostDao();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/hostregister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fullName = request.getParameter("fullName");
		String languagespoken = request.getParameter("languagespoken");
		String Brandname = request.getParameter("Brandname");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");

		Host host = new Host();
		host.setFirstName(fullName);
		host.setLanguagespoken(languagespoken);
		host.setBrandname(Brandname);
		host.setAddress(address);
		host.setContact(contact);
		host.setCity(city);

		try {
			hostDao.registerHost(host);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/hostdetails.jsp");
		dispatcher.forward(request, response);
	}
}
