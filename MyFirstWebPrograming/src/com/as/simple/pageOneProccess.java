package com.as.simple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageOneProccess
 */
public class pageOneProccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String add=request.getParameter("add");
		String phone=request.getParameter("phone");
		
		//System.out.println("Student's name is "+name+"\nAddess is  "+add+"\nphone Number "+phone );
	     
		request.getSession().setAttribute("name",name);
		request.getSession().setAttribute("add",add);
		request.getSession().setAttribute("phone",phone);
		
		response.sendRedirect("HTML/Details.html");
		
	}

}
