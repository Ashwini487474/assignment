package com.Practice_Project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p_id = request.getParameter("productId");
		String p_name = request.getParameter("productName");
		String p_bill = request.getParameter("productBill");
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("p_id", p_id);
		theSession.setAttribute("p_name", p_name);
		theSession.setAttribute("p_bill", p_bill);
		
		
		response.sendRedirect("product2.jsp");
		
	}

}
