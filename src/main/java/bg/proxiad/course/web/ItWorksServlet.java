package bg.proxiad.course.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/it-works")
public class ItWorksServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String httpMethod = req.getMethod();
		String contextPath = req.getContextPath();
		String pathInfo = req.getPathInfo();
		String q = req.getParameter("q");
		String userAgent = req.getHeader("User-agent");
		Enumeration<String> hn = req.getHeaderNames();
//		while (hn.hasMoreElements()) {
//			String name = hn.nextElement();
//			resp.getWriter().write(name + ": " + req.getHeader(name) + "\n");
//		}
		resp.setHeader("Content-Type", "text/html");
		resp.getWriter().write(httpMethod + " " + contextPath + pathInfo + "?q=" + q + "\n");
		resp.getWriter().write("<br/>It works realy!");
	}
	
	

}

