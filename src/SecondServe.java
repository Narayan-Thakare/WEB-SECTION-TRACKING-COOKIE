

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServe
 */
@WebServlet("/SecondServe")
public class SecondServe extends HttpServlet {
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try{
		resp.setContentType("text/html");
		PrintWriter out	=resp.getWriter();	
	out.print(" <h1>welcome to Second Serve </h1>  " );

		Cookie ck[]=req.getCookies();
		out.print("Seconds Serve uname: "+ck[0].getValue());
		out.print("<br>");
		out.print("Seconds Serve upass: "+ck[1].getValue());

		}catch(Exception e){
			
			System.out.println(e);
		}
		
		
	}

}
