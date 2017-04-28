package bg.proxiad.course.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	
	private Calculator calculator;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		calculator = new Calculator();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/calculator.jsp");
		
		String op1Value = req.getParameter("op1");
		String op2Value = req.getParameter("op2");
		
		String inputInError = null;
		String errorMessage = null;
		
		int op1 = 0;
		try {
			op1 = Integer.parseInt(op1Value);
		} catch(NumberFormatException e) {
			inputInError = "op1";
			errorMessage = e.getMessage();
			
			req.setAttribute("inputInError", inputInError);
			req.setAttribute("errorMessage", errorMessage);
			dispatcher.forward(req, resp);
		}
		
		int op2 = 0;
		try {
			op2 = Integer.parseInt(op2Value);
		} catch(NumberFormatException e) {
			inputInError = "op2";
			errorMessage = e.getMessage();
			
			req.setAttribute("inputInError", inputInError);
			req.setAttribute("errorMessage", errorMessage);
			dispatcher.forward(req, resp);
		}
		
		int result = calculator.add(op1, op2);
		
		req.setAttribute("result", result);
		dispatcher.forward(req, resp);
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/calculator.jsp");
		dispatcher.forward(req, resp);
	}
	
}
