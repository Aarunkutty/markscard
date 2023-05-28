package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataAccessObject.StudentMarksDAO;

@WebServlet("/delete")
public class KSEEB_Delete extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int sid1 = Integer.parseInt(req.getParameter("register"));

		StudentMarksDAO dao = new StudentMarksDAO();

		resp.getWriter().print(dao.delete(sid1));
		
	}
}
