package bg.proxiad.course.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class CalculatorServlet extends HttpServlet {
	
	private Calculator calculator;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		calculator = new Calculator();
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String op1Value = req.getParameter("op1");
		String op2Value = req.getParameter("op2");
		
		int op1 = Integer.parseInt(op1Value);
		int op2 = Integer.parseInt(op2Value);
		
		int result = calculator.add(op1, op2);
		
		req.setAttribute("result", result);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result.jsp");
		dispatcher.forward(req, resp);
	}
	
}
