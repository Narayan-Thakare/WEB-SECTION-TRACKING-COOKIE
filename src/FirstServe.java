

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServe
 */
@WebServlet("/FirstServe")
public class FirstServe extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		resp.setContentType("text/html");
		PrintWriter out	=resp.getWriter();	
	//	p.print("welcome <h1>narayan </h1>  " );

		String fn=req.getParameter("first name");
		String pass=req.getParameter("last name");

		out.print("Name :"+fn+"<br>");
		out.print(" sir Name : "+pass+"<br>");
		
		Cookie ck=new Cookie("uname", fn);
		Cookie ck1=new Cookie("upass", pass);
		resp.addCookie(ck);
		resp.addCookie(ck1);

		
		out.print("<form action='SecondServe'>");
		out.print("<input type ='submit' value='Second Serve' >");
		out.print("</form>");
		
		
	}

	
}
