package deba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String tos = req.getParameter("tos");
		
		PrintWriter out = res.getWriter();

		if(tos == null || tos.equals("off"))
		{
			out.println("<h1>Error :(</h1><h3>Please agree to the terms of service.</h3>");
			return;
		}
		
		out.println("<h1>Welcome!</h1>");
		out.println("<h3>Name: <i>"+name+"</i></h3>");
		out.println("<h3>Password: <i>"+password+"</i></h3>");
		out.println("<h3>Email: <i>"+email+"</i></h3>");
		out.println("<h3>Gender: <i>"+gender+"</i></h3>");
		out.println("<h3>Course: <i>"+course+"</i></h3>");
	}
}
