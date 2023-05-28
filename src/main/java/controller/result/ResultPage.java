package controller.result;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class ResultPage extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String register_Number = req.getParameter("register");
		int register_Number_int = Integer.parseInt(register_Number);
		RequestDispatcher dispatcher = req.getRequestDispatcher("markscard");
		dispatcher.forward(req, resp);
	}
}
