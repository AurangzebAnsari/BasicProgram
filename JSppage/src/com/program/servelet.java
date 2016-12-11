package com.program;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import com.program.*;
/**
 * Servlet implementation class servelet
 */
public class servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StringBuilder cvsSkills=new StringBuilder();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String fname=request.getParameter("txtfname");
		int id=request.getIntHeader("txtid");
		String lname=request.getParameter("txtlname");
		String gender=request.getParameter("rgender");
		String email=request.getParameter("txtemail");
		String password=request.getParameter("txtpassword");
		String state=request.getParameter("cmostate");
		String birthday=request.getParameter("dob");
		String address=request.getParameter("txtAddress");
		String skills[]=request.getParameterValues("chskill");
		
		for (String skill : skills) {
			if(cvsSkills.length()>0)
			   cvsSkills.append(",");
			
			cvsSkills.append(skill);
		}
		String cvsSkill=cvsSkills.toString();
		
		getterandgetter setter=new getterandgetter();
		
		setter.setFname(fname);
		setter.setLname(lname);
		setter.setId(id);
		setter.setGender(gender);
		setter.setEmail(email);
		setter.setPassword(password);
		setter.setState(state);
		setter.setAddress(address);
		setter.setBirthday(birthday);
		setter.setSkills(cvsSkill);
		try{
		dbManager.insert(setter);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
